/**
 * You will eventually need to add header comments to this file.
 */
package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class GameControl implements Runnable, ActionListener
{
	//Fields
	GameView view;
	GameState state;
	Wave wave = ResourceLoader.getLoader().getWave("wave.txt");
	
	int framesElapsed = 0;
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
    	state.addGameObject(new Menu(state));
    //	state.addGameObject(new Trooper(0.0,state));
    	//state.addGameObject(new DarkTrooper(0.0,state));
    	
    	
    	// Take timer out of GameView
    	Timer timer = new Timer(17, this);
		timer.start();
    }

    
    /* The following method is required for action events.  You'll need to set up
	 * the timer in the constructor in order for this method to be automatically
	 * called.  Re-add the missing code in the constructor.
	 */
    
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//handle the wave
		WaveProcessor.evaluateCurrentFrame(wave, framesElapsed, state);
		
		state.updateAll();
		view.repaint();
		
		state.consumeMouseClicked();
		framesElapsed++;
	}
}
