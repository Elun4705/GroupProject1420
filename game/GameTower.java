package game;

import java.awt.Color;
import java.awt.Graphics;

public class GameTower extends Tower
{
	int cooldownTimer = 100;

	public GameTower(int xPosition, int yPosition, GameState state) {
		super(xPosition, yPosition, state);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(double timeElapsed) {
		
		Enemy enemy = state.getClosestEnemy(xPosition, yPosition);
		//System.out.println(enemy);
		if (enemy != null)
		{
			if(enemy.getLocation().distance(xPosition,yPosition) < 100.0 && cooldownTimer >=100)
			{
				enemy.takeDamage(1);
				state.addGameObject(new Pebbles(xPosition, yPosition, state, enemy.getLocation().x, enemy.getLocation().y));
				cooldownTimer = 0;
			}
		}
		
		cooldownTimer++;
	}

	@Override
	public void draw(Graphics g) {
		//draw rectangle
		g.setColor(Color.GREEN);
		g.fillRect(xPosition, yPosition, 25, 40);
		
	}

}
