package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class DarkTrooper extends Enemy {
	
	private double position;

	public DarkTrooper(double position, GameState state) 
	{
		super(position, state);
		health = 30;
	}
	
	
	public void draw(Graphics g) 
	{
	
		ResourceLoader loader = ResourceLoader.getLoader();
		Path path = loader.getPath("path.txt");
		
		Point point = path.getPathPosition(position);
		g.setColor(Color.BLACK);
		g.fillOval(point.x-10, point.y-10, 15, 15);
	}

	@Override
	public void update(double timeElapsed) 
	{
		position += 0.002;
		
		//once it reaches the end of the path, remove the object
		if(position >= 1.0)
		{

			state.removeGameObject(this);
			state.changeLifeCounter(-3);
		}
		
		if (health <= 0)
		{
			state.removeGameObject(this);
			state.changeCredits(5);
			state.changeScore(10);
		}
		
	}


	@Override
	public Point getLocation() 
	{

		Path path = ResourceLoader.getLoader().getPath("path.txt");
		Point point = path.getPathPosition(position);
		return point;
	}


	@Override
	public void takeDamage(int damage) {
		health -= damage;
		
	}
	
}
