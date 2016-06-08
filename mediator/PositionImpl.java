package mediator;

public class PositionImpl extends Position{

	public PositionImpl(int x, int y) {
		super(x, y);
	}

	@Override
	public void addUser(User user) {

		this.user = user;
	}

	
	
}
