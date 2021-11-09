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
	
	public static ResourceLoader getLoader()
	{
		if (loader == null)
		{
			loader = new ResourceLoader();
			
		} 
		
		return loader;		
	}
	
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
	
	public Path getPath(String pathName)
	{
		
		if (loadedImages.get(pathName) != null)
		{
			return loadedPath.get(pathName);
			
		} else {
			
			ClassLoader loader = this.getClass().getClassLoader();
			
			Scanner pathScanner = new Scanner(loader.getResourceAsStream("resources/path.txt"));
			
			Path path = new Path(pathScanner);
			
			loadedPath.put(pathName, path);
			
			return path;
		}
		
		
	}

}
