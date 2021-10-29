/**
 * You will eventually need to add header comments to this file.
 */
package game;

public class GameControl implements Runnable
{
    public GameControl ()
    {
    	// I moved all the code into a function named 'run' below.
    }
    
    
    public void run ()
    {    	
    	// Build a view.  Note that the view builds it's own frame, etc.  All the work is there.
    	
    	GameView view = new GameView ();
    	
    	// Build the game state.
    	
    	// Start the animation loop.
    }
}
