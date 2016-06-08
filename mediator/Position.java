package mediator;

//position inside the board
public abstract class Position {
	
	protected int x,y;
	protected User user;
	
	public Position(int x,int y){
		this.x=x;
		this.y =y;
	}

	public abstract void addUser(User user);

}
