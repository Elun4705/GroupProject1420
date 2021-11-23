package game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Backdrop implements Animatable {

	public Backdrop() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void update(double timeElapsed) {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw(Graphics g) {
		// Draw the backdrop.
		ResourceLoader loader = ResourceLoader.getLoader(); // Gets the resource loader object
		BufferedImage backdrop = loader.getImage("path_1.jpg");
		
		g.drawImage(backdrop, 0, 0, null);

	}

}
