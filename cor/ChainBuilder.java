package cor;

public class ChainBuilder {
	private DataProcessor handler;
	
	private static ChainBuilder builder;
	
	private ChainBuilder(){}
	
	public static final ChainBuilder getBuilder(){
		if(builder==null) builder = new ChainBuilder();
		return builder;
	}
	
	public void buildChain(){
		DataProcessor validator = new Validator();
		DataProcessor dataWasher = new DataWasher();
		DataProcessor reporter = new Reporter();
		validator.nextProcessor = dataWasher;
		dataWasher.nextProcessor = reporter;
		handler = validator;
	}

	public DataProcessor getHandler() {
		return handler;
	}

	
	
}
