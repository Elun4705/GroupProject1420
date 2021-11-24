package game;

public class WaveProcessor 
{
	
	public static void evaluateCurrentFrame(Wave wave, int index, GameState state) 
	{
		
		switch(wave.getInstruction(index))
		{
			case ".":
				break;
			case "o":
				state.addGameObject(new Trooper(0.0,state));
			break;
			case "x":
				state.addGameObject(new DarkTrooper(0.0, state));
			break;
			case "!":
				System.exit(0);
			break;
		}
	}

}
