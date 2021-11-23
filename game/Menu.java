package game;

import java.awt.Color;
import java.awt.Graphics;

public class Menu implements Animatable {
	
	private GameState state;

	public Menu(GameState state) {
		this.state = state;
	}

	@Override
	public void update(double timeElapsed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(new Color(0.5f, 0.2f, 1f));
		g.fillRect(600, 0, 300, 600);
		
	}

}
