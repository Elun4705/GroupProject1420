package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Menu implements Animatable {
	
	private GameState state;
	boolean justCreated = true;

	public Menu(GameState state) 
	{
		this.state = state;
		
		
	}

	@Override
	public void update(double timeElapsed) 
	{
		if(justCreated)
		{
			state.addGameObject(new MenuTower(650,300,state));
			justCreated = false;
		}
		
	}

	@Override
	public void draw(Graphics g) 
	{
		g.setColor(new Color(0.5f, 0.2f, 1f));
		g.fillRect(600, 0, 300, 600);
		
		//text
		//lives
		Font font = new Font("Arial", Font.BOLD, 12);
	    g.setFont(font);
	    g.setColor(Color.WHITE);
		g.drawString("Lives: " + state.getLifeCounter(), 650, 20);
		
		//score
		g.drawString("Score: " + state.getScore(), 650, 50);
		
		//Credits
		g.setColor(Color.YELLOW);
		g.drawString("Credits: " + state.getCredits(), 650, 80);
		
	}

}
