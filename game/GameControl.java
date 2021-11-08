/**
 * You will eventually need to add header comments to this file.
 */
package game;

public class GameControl implements Runnable
{
	//Fields
	GameView view;
	GameState state;
	
    public GameControl ()
    {
    	// I moved all the code into a function named 'run' below.
    }
    
    
    public void run ()
    {    	
    	// Build a view.  Note that the view builds it's own frame, etc.  All the work is there.
    	
    	view = new GameView ();
    	
    	// Build the game state.
    	
    	state = new GameState();
    	
    	//add a blue circle
    	
    	// Start the animation loop.
    	
    	//take timer out of gameview
    }
}
