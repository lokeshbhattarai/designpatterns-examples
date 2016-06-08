package builder;

public interface RequestBuilder {

	void createRequest(Agent agent,String reqId);
	void obtainCustomerDetails();
	void receiveCustomerRequest();
	void addResponse();
	void closeCall();
	
}
