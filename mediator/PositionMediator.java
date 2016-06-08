package mediator;

public interface PositionMediator {

	public boolean isValidMove(Position position,User user);
	public boolean addPosition(Position pos);
	public void reverse();
	
}
