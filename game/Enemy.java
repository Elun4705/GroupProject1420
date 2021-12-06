package game;

import java.awt.Graphics;
import java.awt.Point;

public abstract class Enemy implements Animatable {
	
	protected double position;
	protected GameState state;
	protected int health;
	
	public Enemy(double position, GameState state) 
	{
		this.position = position;
		this.state = state;
	}


	public abstract void update(double timeElapsed);
	
	public abstract void takeDamage(int damage);

	public abstract void draw(Graphics g);
	
	public abstract Point getLocation();
	
}
