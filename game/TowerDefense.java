/**
 * You will eventually need to add header comments to this file.
 */
package game;

import java.lang.reflect.InvocationTargetException;

import javax.swing.SwingUtilities;

public class TowerDefense 
{
	public static void main(String[] args) throws InvocationTargetException, InterruptedException 
	{
		// Build a game control object.  Note -- I changed
		// the order of execution slightly.  The constructor
		// no longer sets up the game -- that code is now
		// in a 'run' method.  (Check out the GameControl class.)
		
		GameControl gc = new GameControl();
		
		// It is important to set up GUIs using something
		// called the GUI thread.  The statement below will
		// use the GUI thread and automatically call the
		// 'run' function in our GameControl object.
		//
		// We'll have to discuss this next week.
		
		SwingUtilities.invokeAndWait(gc);
		
		// (The above function call may throw an exception.
		// I added a 'throws' to main to deal with it.)
	}

}
