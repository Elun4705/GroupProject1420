package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class MenuTower extends Tower
{


	public MenuTower(int xPosition, int yPosition, GameState state) 
	{
		super(xPosition, yPosition, state);		
	}


	public void update(double timeElapsed) 
	{
		if(state.isMouseClicked())
		{
			if(state.getMouseX() >= xPosition && state.getMouseX() < xPosition + 25
					&& state.getMouseY() >= yPosition && state.getMouseY() < yPosition + 40 &&
					state.getCredits() >= 10)
			{
				state.addGameObject(new MouseTower(state.getMouseX(),state.getMouseY(),state));
				state.changeCredits(-10);
			}		
			
		}
		
	}

	@Override
	public void draw(Graphics g) 
	{
		//draw rectangle
		
		g.setColor(Color.GREEN);
		g.fillRect(xPosition, yPosition, 25, 40);
		
		Font font = new Font("Arial", Font.BOLD, 12);
	    g.setFont(font);
	    g.setColor(Color.WHITE);
		g.drawString("Price: 10", xPosition, yPosition + 50);

		
	}

}
