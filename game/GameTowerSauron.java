package game;

import java.awt.Color;
import java.awt.Graphics;

public class GameTowerSauron extends TowerSauron
{

	public GameTowerSauron(int xPosition, int yPosition, GameState state) {
		super(xPosition, yPosition, state);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(double timeElapsed) {
		
		Enemy enemy = state.getClosestEnemy(xPosition, yPosition);
		//System.out.println(enemy);
		if (enemy != null)
		{
			if(enemy.getLocation().distance(xPosition,yPosition) < 100.0)
			{
				enemy.takeDamage(1);
				state.addGameObject(new Lava(xPosition, yPosition, state, enemy.getLocation().x, enemy.getLocation().y));
				
			}
		}
		
		
	}

	@Override
	public void draw(Graphics g) {
		//draw rectangle
		g.setColor(Color.BLACK);
		g.fillRect(xPosition, yPosition, 25, 40);
		
		g.setColor(Color.ORANGE);
		g.fillOval(xPosition, yPosition-10, 25, 25);
		
	}

}
