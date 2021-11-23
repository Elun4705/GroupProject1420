package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Trooper extends Enemy 
{
	
	private double position;
	
	public Trooper(double position) {
		this.position = position;
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
			position = 0.0;
		}
	}
}
