package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Scanner;

/**
 * 
 * @author Lucas and Emmanuel
 *
 */
public class Path {
	
	int[] xCoords,yCoords; 

	  /** This constructor does the following:  
     *     - It reads a number of coordinates, n, from the scanner. 
     *     - It creates new array(s) (or an ArrayList) to hold the path coordinates,
     *          and stores it in the field in 'this' object.
     *     - It loops n times, each time scanning a coordinate x,y pair, creating an
     *         object to represent the coordinate (if needed), and stores the coordinate
     *         in the array(s) or ArrayList.
     * 
     * @param s  a Scanner set up by the caller to provide a list of coordinates
     */
	public Path(Scanner s)
	{
		//Finds how many coordinate pairs are in the path
		int pathSize = s.nextInt();
		
		//Declares parrallel arrays of the correct size
		xCoords = new int[pathSize];
		yCoords = new int[pathSize];
		
		//Reads from the path file
		for(int i = 0; i < pathSize; i++)
		{
			xCoords[i] = s.nextInt();
			yCoords[i] = s.nextInt();
		}
		
	}
	
	 /**
     * Draws the current path to the screen (to wherever the graphics object points)
     * using a highly-visible color.
     * 
     * @param g   a graphics object
     */
	public void draw(Graphics g)
	{
		//draws a line between 
		for(int i = 0; i < xCoords.length-1; i++)
		{
			g.setColor(Color.red);
			g.drawLine(xCoords[i], yCoords[i], xCoords[i+1], yCoords[i+1]);		
		}
	}
	
	/** 
	 * Returns the total length of the path. Since the path
	 * is specified using screen coordinates, the length is
	 * in pixel units (by default).
	 * 
	 * @return the length of the path
	 */
	 public double getPathLength ()
	 {
		 double result = 0.0;
		 
		 //Find the distance between the current point and the next point in the path, and add it to the total distance
		 for(int i = 0; i < xCoords.length-1; i++)
		 {
			double distance;
			
			//Pythagoras
			distance = Math.sqrt( (xCoords[i+1] - xCoords[i])^2 + (yCoords[i+1] - yCoords[i]));  
			
			result += distance;
		 }
		 
		 return result;
	 }
	 
	 /** 
	  * Given a percentage between 0% and 100%, this method calculates
	  * the location along the path that is exactly this percentage
	  * along the path. The location is returned in a Point object
	  * (integer x and y), and the location is a screen coordinate.
	  * 
	  * If the percentage is less than 0%, the starting position is
	  * returned. If the percentage is greater than 100%, the final
	  * position is returned.
	  * 
	  * If students don't want to use Point objects, they may 
	  * write or use another object to represent coordinates. 
	  *
	  * Caution: Students should never directly return a Point object
	  * from a path list. It could be changed by the outside caller.
	  * Instead, always create and return new point objects as
	  * the result from this method.
	  * 
	  * @param percentTraveled a distance along the path
	  * @return the screen coordinate of this position along the path
	  */
	  public Point getPathPosition (double percentTraveled)
	  {
		  Point finalPoint = null;
		  double totalLength = getPathLength();
		  double currentDistance = 0;
		
		  double totalDistance  = percentTraveled * totalLength;
		  
		  for (int i = 0; i < xCoords.length; i++) 
		  {
			  
			  if ( currentDistance < totalDistance ) {
				  
				  currentDistance = currentDistance + Math.sqrt( (xCoords[i+1] - xCoords[i])^2 + (yCoords[i+1] - yCoords[i]));
				  
			  } else if (currentDistance == totalDistance) {
				  
				  finalPoint = new Point (xCoords[i], yCoords[i]);
				  
			  }
			  
		  }
		  
		  
		  return finalPoint;
		  
	  }	
}
