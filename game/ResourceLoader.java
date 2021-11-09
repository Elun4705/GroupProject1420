package game;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * @author EMoon
 *
 */


public class ResourceLoader {
	
	HashMap <String, BufferedImage> loadedImages = new HashMap<String, BufferedImage>();
	HashMap <String, Path> loadedPath = new HashMap<String, Path>();
	
	private static ResourceLoader loader = null;
	
	
	private ResourceLoader()
	{
		
	}
	
	/**This method returns a ResourceLoader object. 
	 * If there isn't one, it constrcuts one and stores it. Otherwise it returns the same instances that it has stored
	 * This ensures there is only ever one ResourceLoader object.
	 * 
	 * @return the resource loader object
	 */
	public static ResourceLoader getLoader()
	{
		if (loader == null)
		{
			loader = new ResourceLoader();
			
		} 
		
		return loader;		
	}
	
	
	/**This method looks up an image resource in the HashMap of already loaded images and returns it. 
	 * 
	 * If the given file name has not already been loaded by the program, it loads it for the first time and then stores it in
	 * a HashMap before returning it.
	 * 
	 * @param fileName the file name to look up and return
	 * @return the desired BufferedImage object
	 */
	public BufferedImage getImage(String fileName)
	{
		
		if (loadedImages.get(fileName) != null)
		{
			return loadedImages.get(fileName);
			
		} else {
			try
			{
				ClassLoader loader = this.getClass().getClassLoader();
				InputStream is = loader.getResourceAsStream("resources/" + fileName);
				BufferedImage image = javax.imageio.ImageIO.read(is);
				
				loadedImages.put(fileName, image);
				return image;
			}
			catch (IOException e)
			{
				System.out.println("Could not load the image " + fileName);
				System.exit(0);
				return null;
			}
		}
		
	}
	
	/**This method looks up a path file in the HashMap of already loaded paths and returns it. 
	 * 
	 * If the given file name has not already been loaded by the program, it loads it for the first time, 
	 * constructs a Path object from the file, then stores the path in
	 * a HashMap before returning it.
	 * 
	 * @param pathName the file name to look up and return
	 * @return the desired Path object
	 */
	public Path getPath(String pathName)
	{
		
		if (loadedImages.get(pathName) != null)
		{
			return loadedPath.get(pathName);
			
		} else {
			
			ClassLoader loader = this.getClass().getClassLoader();
			
			Scanner pathScanner = new Scanner(loader.getResourceAsStream("resources/"+pathName));
			
			Path path = new Path(pathScanner);
			
			loadedPath.put(pathName, path);
			
			return path;
		}
		
		
	}

}
