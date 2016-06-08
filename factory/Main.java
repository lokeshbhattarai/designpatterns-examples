package factory;

public class Main {

	public static void main(String[] args) {
				
		DebuggerFactory debuggerFactory = DebuggerFactory.getDebuggerFactory();
		Trace debuggerConsole = debuggerFactory.getDebugTool(ToolType.CONSOLE);
		
		debuggerConsole.setDebug(true);
		debuggerConsole.debug("This message is for debug test");
		debuggerConsole.error("You have an error");
		
		Trace debuggerFile = debuggerFactory.getDebugTool(ToolType.FILE);
		
		debuggerFile.setDebug(true);
		debuggerFile.debug("This message is for debug test for file trace");
		debuggerFile.error("FileTrace:You have an error");
	}
}