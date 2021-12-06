package game;

public abstract class TowerSauron implements Animatable {

	protected int xPosition, yPosition;
	protected GameState state;

	public TowerSauron(int xPosition, int yPosition, GameState state) 
	{
		this.xPosition = xPosition;
		this.yPosition = yPosition;
		this.state = state;
	}

}
