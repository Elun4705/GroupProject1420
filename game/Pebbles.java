package game;

import java.awt.Color;
import java.awt.Graphics;

public class Pebbles extends Effects {
	
	int lifeTime = 2;
	int xTarget, yTarget;
	Path path;
	Double pathPercentage = 0.0;
	
	public Pebbles(int xPosition, int yPosition, GameState state, int xTarget, int yTarget) {
		super(state);
		this.xPosition = xPosition;
		this.yPosition = yPosition; 
		this.xTarget = xTarget;
		this.yTarget = yTarget;
		this.path = new Path(xPosition, yPosition, xTarget, yTarget);
	}

	@Override
	public void update(double timeElapsed) {
		
		if(pathPercentage >= 1.0)
		{
			state.removeGameObject(this);
		}
		pathPercentage += 0.1;

	}

	@Override
	public void draw(Graphics g) {
		
		path.getPathPosition(pathPercentage);
		
		g.setColor(Color.BLACK);
		g.fillOval(path.getPathPosition(pathPercentage).x, path.getPathPosition(pathPercentage).y, 5, 5);

	}

}
