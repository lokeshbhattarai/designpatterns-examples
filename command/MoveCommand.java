package command;

public class MoveCommand implements Icommand{
	private CommandExecutor executor;
	private Square square,movedSquare;
	
	public MoveCommand(Square square){
		this.square = square;
		this.executor = new CommandExecutor();
	}

	@Override
	public Square execute() {
		System.out.println("*********move  execute command************");
		System.out.println("Original square::"+square.toString());
		movedSquare = executor.moveSquare(this.square);
		
		System.out.println("movedSquare::"+movedSquare.toString());
		return movedSquare;
	}

	@Override
	public Square undo() {
		if(movedSquare==null) {
			throw new RuntimeException("Must execute command first");
		}
		
		System.out.println("************move undo command************");
		System.out.println("Original square::"+movedSquare.toString());
		square = executor.moveSquareLeft(movedSquare);
		System.out.println("moved left square::"+square.toString());
		return square;
	}

}
