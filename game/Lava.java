package game;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Lava extends Effects {

	int lifeTime = 2;
	int xTarget,yTarget;
	public Lava(int xPosition, int yPosition, GameState state, int xTarget, int yTarget) {
		super(state);
		this.xPosition = xPosition;
		this.yPosition = yPosition; 
		this.xTarget = xTarget;
		this.yTarget = yTarget;
	}

	@Override
	public void update(double timeElapsed) {
		// TODO Auto-generated method stub
		lifeTime--;
		if(lifeTime <= 0)
		{
			state.removeGameObject(this);
		}

	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));
		g2.drawLine(xPosition+12, yPosition, xTarget, yTarget);

	}

}
