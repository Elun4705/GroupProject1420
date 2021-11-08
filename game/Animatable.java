package game;

import java.awt.Graphics;

public interface Animatable 
{
	public void update (double timeElapsed);
	public void draw (Graphics g);
}
