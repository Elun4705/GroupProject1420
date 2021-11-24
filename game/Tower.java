package game;

public abstract class Tower implements Animatable {

	protected int xPosition, yPosition;
	protected GameState state;

	public Tower(int xPosition, int yPosition, GameState state) 
	{
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.state = state;
	}

}
