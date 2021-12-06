package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class StartPrompt extends Effects
{
	GameState state;
	public StartPrompt(GameState state)
	{
		super(state);
		this.state = state;
	}

	@Override
	public void update(double timeElapsed) {
		// TODO Auto-generated method stub
		if(state.getGameStarted())
		{
			state.removeGameObject(this);
		}
		
	}

	@Override
	public void draw(Graphics g) 
	{
		Font font = new Font("Consolas", Font.BOLD, 72);
	    g.setFont(font);
	    g.setColor(Color.RED);
		g.drawString("Press S to start:", 50, 300);
		
	}

}
