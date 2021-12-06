package game;

public abstract class Effects implements Animatable {
	
	protected int xPosition;
	protected int yPosition;
	protected GameState state;

	public Effects(GameState state) {
		
		this.state = state;
	}
	

}
