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
	private List<Animatable> gameObjects;
	//list of animatable things
	
	private List<Animatable> objectsToAdd;
	private List<Animatable> objectsToRemove;
 	
	private int mouseX, mouseY; 
	private int credits = 100, lifeCounter = 10, score = 0;
	private boolean mouseClicked;
	private boolean gameOver = false;
	
	public GameState ()
	{
		gameObjects = new ArrayList<Animatable>();
		
		objectsToRemove = new ArrayList<Animatable>();
		objectsToAdd = new ArrayList<Animatable>();
	}
	
	
	public void addGameObject(Animatable object) 
	{
		
		objectsToAdd.add(object);
		
	}
	
	public void removeGameObject(Animatable object)
	{
		objectsToRemove.add(object);
	}
	
	
	public void updateAll()
	{
		for(Animatable object : gameObjects)
		{
			object.update(0);
		}
		
		//add objects to be added
		for(Animatable object : objectsToAdd)
		{
			gameObjects.add(object);
		}
		objectsToAdd.clear();
		
		//remove objects to be removed
		for(Animatable object : objectsToRemove)
		{
			gameObjects.remove(object);
		}
		objectsToRemove.clear();		
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
	
	public void changeLifeCounter(int delta)
	{
		lifeCounter += delta;
	}
	
	public int getCredits()
	{
		return credits;
	}
	
	public void changeCredits(int delta)
	{
		credits += delta;
	}
	public int getScore()
	{
		return score;
	}
	
	public boolean getGameOver()
	{
		return gameOver;
	}
	public void setGameOver(boolean condition)
	{
		gameOver = condition;

	}
	
}
