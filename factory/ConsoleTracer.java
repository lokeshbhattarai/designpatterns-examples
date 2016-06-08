package factory;

public class ConsoleTracer implements Trace{

	boolean isDebug = false;
	
	@Override
	public void setDebug(boolean debug) {
		this.isDebug = debug;
		
	}

	@Override
	public void debug(String message) {
		if(isDebug) System.out.println(message);
	}

	@Override
	public void error(String message) {
		if(isDebug) System.out.println(message);
		
	}

}
