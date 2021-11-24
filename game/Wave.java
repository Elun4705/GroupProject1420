package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wave 
{
	List<String> wave = new ArrayList<String>();
	
	public Wave(Scanner s)
	{
		while (s.hasNext())
		{
			wave.add(s.next());
		}
	}
	
	public String getInstruction(int index)
	{
		return wave.get(index);
	}

}
