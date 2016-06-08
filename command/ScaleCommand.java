package command;

public class ScaleCommand implements Icommand{
	CommandExecutor executor;
	Square square;
	Square scaledSquare;
	
	public ScaleCommand(Square square){
		this.square = square;
		this.executor = new CommandExecutor();
	}

	@Override
	public Square execute() {
		System.out.println("************execute scale command************");
		System.out.println("Original square::"+square.toString());
		
		scaledSquare =executor.scaleSquare(square); 
		
		System.out.println("scaledSquare square::"+scaledSquare.toString());
		
		return scaledSquare;
	}

	@Override
	public Square undo() {
		
		if(scaledSquare==null) throw new RuntimeException("Must execute command first");
		
		System.out.println("************undo scale command************");
		System.out.println("Original square::"+scaledSquare.toString());
		
		square =executor.deScaleSquare(scaledSquare); 
		
		System.out.println("deScaledSq square::"+square.toString());
		return square;
	}

}
