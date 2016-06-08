package builder;

public class RequestDirector {
	
	RequestBuilder requestBuilder;
	
	public RequestDirector(RequestBuilder requestBuilder) {
		this.requestBuilder = requestBuilder;
	}

	public void handleRequest(Agent agent, String requestId){
		requestBuilder.createRequest(agent, requestId);
		requestBuilder.obtainCustomerDetails();
		requestBuilder.receiveCustomerRequest();
		requestBuilder.addResponse();
		requestBuilder.closeCall();
	}
	
}
