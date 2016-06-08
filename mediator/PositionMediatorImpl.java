package mediator;

import java.util.ArrayList;
import java.util.List;

public class PositionMediatorImpl implements PositionMediator{

	List<Position> position;
	
	 public PositionMediatorImpl() {
		 this.position = new ArrayList<Position>();
	}
	
	
	@Override
	public boolean isValidMove(Position position, User user) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public void reverse() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean addPosition(Position pos) {
		// TODO Auto-generated method stub
		return false;
	}

}
