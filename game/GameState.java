/**
 * Empty, not yet used.
 */
package game;

import java.util.List;
import java.awt.Graphics;
import java.util.ArrayList;

public class GameState 
{
	//Fields
	List<Animatable> gameObjects;
	//list of animatable things
	
	int mouseX, mouseY;
	boolean mouseClicked;
	
	public GameState ()
	{
		gameObjects = new ArrayList<Animatable>();
	}
	
	
	public void addGameObject(Animatable object) 
	{
		
		gameObjects.add(object);
		
	}
	
	public void updateAll()
	{
		for(Animatable object : gameObjects)
		{
			object.update(0);
		}
	}
	
	public void drawAll(Graphics g)
	{
		for(Animatable object : gameObjects)
		{
			object.draw(g);
		}
	}
	
	public void setMouseLocation(int x, int y)
	{
		mouseX = x;
		mouseY = y;
	}
	
	public int getMouseX()
	{
		return mouseX;
	}
	
	public int getMouseY()
	{
		return mouseY;
	}
	
	public boolean isMouseClicked ()
	{
		return mouseClicked;
	}
	
	public void setMouseClicked ()
	{
		mouseClicked = true;
	}
	
	public void consumeMouseClicked()
	{
		mouseClicked = false;
	}
	
}
