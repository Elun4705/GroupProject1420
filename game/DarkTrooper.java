package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class DarkTrooper extends Enemy {
	
	private double position;

	public DarkTrooper(double position) {
		// TODO Auto-generated constructor stub
		this.position = position;
	}
	
	
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		ResourceLoader loader = ResourceLoader.getLoader();
		Path path = loader.getPath("path.txt");
		
		Point point = path.getPathPosition(position);
		g.setColor(Color.RED);
		g.fillOval(point.x-10, point.y-10, 20, 20);
	}

	@Override
	public void update(double timeElapsed) {
		position += 0.002;
		if(position >= 1.0)
		{
			position = 0.0;
		}
		
	}
	
}
