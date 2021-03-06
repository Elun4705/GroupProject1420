package game;

import java.awt.Color;
import java.awt.Graphics;

import java.awt.Point;

public class MouseTowerSauron extends TowerSauron
{

	public MouseTowerSauron(int xPosition, int yPosition, GameState state) 
	{
		super(xPosition, yPosition, state);
	}

	@Override
	public void update(double timeElapsed) 
	{
		xPosition = state.getMouseX();
		yPosition = state.getMouseY();
		
		if(state.isMouseClicked())
		{
			
			ResourceLoader loader = ResourceLoader.getLoader();
			
			Point ClosestPoint = loader.getPath("path.txt").returnClosestPoint(xPosition, yPosition);
			System.out.println(ClosestPoint.x + " " + ClosestPoint.y);
			if(state.getMouseX() < 600-13 && ClosestPoint.distance(xPosition, yPosition) >= 40.0)
			{
				state.addGameObject(new GameTowerSauron(xPosition-12, yPosition-20, state));
				state.removeGameObject(this);
			}  else
			{
				state.removeGameObject(this);
				state.changeCredits(20);
			}
		}
	}

	@Override
	public void draw(Graphics g) 
	{
		g.setColor(Color.BLACK);
		g.fillRect(xPosition, yPosition, 25, 40);
		
		g.setColor(Color.ORANGE);
		g.fillOval(xPosition, yPosition-10, 25, 25);
	}

}
