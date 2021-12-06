package game;

import java.awt.Color;
import java.awt.Graphics;

public class MenuTowerSauron extends TowerSauron
{


	public MenuTowerSauron(int xPosition, int yPosition, GameState state) 
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
				state.addGameObject(new MouseTowerSauron(state.getMouseX(),state.getMouseY(),state));
				state.changeCredits(-20);
			}		
			
		}
		
	}

	@Override
	public void draw(Graphics g) 
	{
		//draw rectangle
		
		g.setColor(Color.BLACK);
		g.fillRect(xPosition, yPosition, 25, 40);
		
		g.setColor(Color.ORANGE);
		g.fillOval(xPosition, yPosition-10, 25, 25);
		
		g.setColor(Color.WHITE);
		g.drawString("Price: 10", xPosition, yPosition + 50);

		
	}

}
