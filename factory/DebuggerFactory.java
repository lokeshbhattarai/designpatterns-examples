package factory;

public class DebuggerFactory implements Debugger{

	private static DebuggerFactory debugFactory = null;
	private  DebuggerFactory() {}
	
	public static DebuggerFactory getDebuggerFactory(){
		if(debugFactory==null){
			debugFactory = new DebuggerFactory();
		}
		return debugFactory;
	}
	
	@Override
	public Trace getDebugTool(ToolType toolType) {
		switch (toolType) {
		case CONSOLE:
			return new ConsoleTracer();
			
		case FILE:
			return new FileTracer();
			
		default:
			return new ConsoleTracer();
		}
	}

}
