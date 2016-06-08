package command;

import java.util.Stack;

public class Main {

	public static void main(String[] args){
		Stack<Icommand> commandsExecuted = new Stack<Icommand>();
		
		Icommand command1 = new CreatorCommand();
		
		Square square = command1.execute();
		
		if(square!=null){
			commandsExecuted.push(command1);
			
			Icommand scaleCommand = new ScaleCommand(square);
			scaleCommand.execute();
			
			commandsExecuted.push(scaleCommand);
			
			Icommand moveCommand = new MoveCommand(square);
			moveCommand.execute();
			
			commandsExecuted.push(moveCommand);
			
			while(!commandsExecuted.isEmpty()){
				commandsExecuted.pop().undo();
			}
			
			
		}
		
	}
	
}
