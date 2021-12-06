package game;

import java.awt.Color;
import java.awt.Graphics;

public class SuperMeter extends Effects {

	public SuperMeter(GameState state) {
		super(state);
		// TODO Auto-generated constructor stub
	}

	double percentCharged = 0.0;
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
					&& state.getMouseY() >= 500 && state.getMouseY() < 550 && percentCharged >= 1.0)
			{
				//destroy all enemies
				state.destroyAllEnemies();
				percentCharged = 0.0;
				
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
