package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class GameOver extends Effects
{

	@Override
	public void update(double timeElapsed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) 
	{
		Font font = new Font("Consolas", Font.BOLD, 96);
	    g.setFont(font);
	    g.setColor(Color.RED);
		g.drawString("GAME OVER", 50, 300);
		
	}

}
