/**
 * You will eventually need to add header comments to this file.
 */
package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.Timer;

public class GameControl implements Runnable, ActionListener
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
    	// Build the game state.
    	
    	state = new GameState();
    	
    	// Build a view.  Note that the view builds it's own frame, etc.  All the work is there.
    	
    	view = new GameView (state);
    	
    	state.addGameObject(new Backdrop());
    	state.addGameObject(new BlueCircle(0.0));
    	state.addGameObject(new BlueCircle(0.5));
    	
    	//add a blue circle
    	
    	// Start the animation loop.
    	
    	//take timer out of GameView
    	Timer timer = new Timer(17, this);
		timer.start();
    }

    
    /* The following method is required for action events.  You'll need to set up
	 * the timer in the constructor in order for this method to be automatically
	 * called.  Re-add the missing code in the constructor.
	 */
    
	@Override
	public void actionPerformed(ActionEvent e) {
		state.updateAll();
		view.repaint();
	}
}



///* The following methods are required for mouse events.  I've collapsed some of them to
// * make it easier to see which one you need.  Also note:  You'll need to register
// * 'this' object as a listener to its own events.  See the missing code in the
// * constructor.
// */
//
//public void mousePressed(MouseEvent e) 
//{
//	//System.out.println(e.getX() + " " + e.getY());
//}
//
//public void mouseClicked(MouseEvent e) { }
//public void mouseReleased(MouseEvent e) { }
//public void mouseEntered(MouseEvent e) { }
//public void mouseExited(MouseEvent e) { }
