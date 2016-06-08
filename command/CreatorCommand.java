package command;

public class CreatorCommand implements Icommand{
	CommandExecutor executor;
	Square square;
	
	public CreatorCommand(){
		executor = new CommandExecutor();
	}

	@Override
	public Square execute() {
		this.square = executor.createSquare();
		System.out.println("Created square::"+square.toString());
		return this.square;
	}

	@Override
	public Square undo() {
		System.out.println("Created undo::Square NULL");
		return null;
	}

}
