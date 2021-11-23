package game;

import java.awt.Graphics;

public abstract class Enemy implements Animatable {
	
	public Enemy() {}

	@Override
	public abstract void update(double timeElapsed);

	@Override
	public abstract void draw(Graphics g);
	
}
