package game;

import java.awt.Color;
import java.awt.Graphics;

public class SuperMeter extends Effects {

	double percentCharged = 0.0;
	private GameState state;
	@Override
	public void update(double timeElapsed) {
		// TODO Auto-generated method stub
		if(percentCharged <= 1.0)
		{
			percentCharged += 0.001;
		}
		
		if(state.isMouseClicked())
		{
			if(state.getMouseX() >= 100 && state.getMouseX() < 600
					&& state.getMouseY() >= 500 && state.getMouseY() < 550)
			{
				//destroy all enemies
			}
		}

	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		
		g.setColor(Color.GRAY);
		g.fillRect(100, 500, 600, 50);
		
		g.setColor(Color.PINK);
		if(percentCharged >= 1)
		{
			g.setColor(Color.RED);
		}
		g.fillRect(100, 500, (int) (600*percentCharged), 50);

	}

}
