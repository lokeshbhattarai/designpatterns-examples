package cor;

public abstract class DataProcessor {

	protected DataProcessor nextProcessor;

	public abstract void handleRecord(CallRecord callRecord);
	
}
