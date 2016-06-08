package mediator;

public class Main {

	public static void main(String[] args) {
		User user1 = new User("Black");
		User user2 = new User("White");
		
		
		PositionMediator mediator = new PositionMediatorImpl();
		
		Position pos1 = new PositionImpl(1,0);
		
		mediator.addPosition(pos1);
		
		
		
		
	}

}
