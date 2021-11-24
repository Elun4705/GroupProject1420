package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Trooper extends Enemy 
{
	
	public Trooper(double position, GameState state) 
	{
		super(position, state);
	}
	
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		ResourceLoader loader = ResourceLoader.getLoader();
		Path path = loader.getPath("path.txt");
		
		Point point = path.getPathPosition(position);
		g.setColor(Color.BLUE);
		g.fillOval(point.x-10, point.y-10, 20, 20);
	}

	@Override
	public void update(double timeElapsed) {
		// TODO Auto-generated method stub
		position += 0.001;
		if(position >= 1.0)
		{
			//position = 0.0;
			state.removeGameObject(this);
		}
	}

	@Override
	public Point getLocation() 
	{
		Path path = ResourceLoader.getLoader().getPath("path.txt");
		Point point = path.getPathPosition(position);
		return point;
	}
}
