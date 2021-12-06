package game;

import java.awt.Color;
import java.awt.Graphics;

public class GameTowerSauron extends Tower
{

	public GameTowerSauron(int xPosition, int yPosition, GameState state) {
		super(xPosition, yPosition, state);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(double timeElapsed) {
		// TODO Auto-generated method stub
		
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
