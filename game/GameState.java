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
	int credits = 100, lifeCounter = 10, score = 0;
	boolean mouseClicked;
	boolean gameOver;
	
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
	
	public int getLifeCounter()
	{
		return lifeCounter;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public boolean setGameOver(boolean condition)
	{
		boolean gameOver = condition;
		return gameOver;
	}
	
}
