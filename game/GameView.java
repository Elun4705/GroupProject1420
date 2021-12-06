/**
 * You will eventually need to add header comments to this file.
 */
package game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameView extends JPanel implements MouseListener, MouseMotionListener, KeyListener
{
	// This constant is needed to get rid of a warning.  It won't matter to us.

	private static final long serialVersionUID = 1L;

	// Fields -- These variables will be part of the GameView object (that we make in GameControl).
	private GameState state;
	// I have removed the other fields.  Add them back in as part of the first checkpoint.

	/**
	 * Our GameView constructor.  The 'view' is the GUI (Graphical User Interface) and
	 * this constructor builds a JFrame (window) so the user can see our 'drawing'.
	 */
	public GameView (GameState state)
	{
		this.state = state;
		// Build the frame.  The frame object represents the application 'window'.

		JFrame frame = new JFrame ("Tower Defense 2021");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Add a drawing area to the frame (a panel).  Note that 'this' object IS the
		// panel that we need, so we add it.

		JPanel p = this;
		frame.setContentPane(p);

		// Set the size of 'this' panel to match the size of the backdrop.    	

		Dimension d = new Dimension(800, 600);
		this.setMinimumSize(d);
		this.setPreferredSize(d);
		this.setMaximumSize(d);

		// Allow the JFrame to layout the window (by 'packing' it) and make it visible.

		frame.pack();
		frame.setVisible(true);

		// This panel can send mouse events to any object that wants to 'listen' to those
		// events.  I've removed the lines of code for the mouse listener and timer,
		// feel free to re-add them as needed.
		
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
		this.setFocusable(true);

		
	}

	/**
	 * Draws our game.  This function will be called automatically when Java needs to
	 * repaint our window.  Use the repaint() function call (on this object) to cause
	 * this function to be executed.
	 * 
	 * @param Graphics g  the Graphics object to use for drawing
	 */
	public void paint (Graphics g)
	{
		state.drawAll(g);
		// I've removed the code that draws the path and the ball.  You will need
	

	}

	/* The following methods are required for mouse events.  I've collapsed some of them to
	 * make it easier to see which one you need.  Also note:  You'll need to register
	 * 'this' object as a listener to its own events.  See the missing code in the
	 * constructor.
	 */
	
	public void mousePressed(MouseEvent e) 
	{
		
		state.setMouseClicked();
		
	}
	
	public void mouseClicked(MouseEvent e) { }
	public void mouseReleased(MouseEvent e) { }
	public void mouseEntered(MouseEvent e) { }
	public void mouseExited(MouseEvent e) { }

	@Override
	public void mouseDragged(MouseEvent e) 
	{
		state.setMouseLocation(e.getX(), e.getY());
		
	}

	@Override
	public void mouseMoved(MouseEvent e) 
	{
		state.setMouseLocation(e.getX(), e.getY());
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyChar() == 's')
		{
			state.startGame();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
