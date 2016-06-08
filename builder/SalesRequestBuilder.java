package builder;

import java.io.Console;
import java.util.Date;

public class SalesRequestBuilder implements RequestBuilder{

	@Override
	public void addResponse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeCall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createRequest(Agent agent, String reqId) {
		Request reqeust = new Request(reqId);
		reqeust.setAgent(agent);
		
	}

	@Override
	public void obtainCustomerDetails() {
		 	Console console = System.console();
		    String firstName = console.readLine("Please enter user name : ");   
		    System.out.println("You entered : " + firstName);
		    if(!doesCustomerExist(firstName)){
		    	Customer customer = new Customer(""+new Date().getTime(),firstName,"Smith","659494");
		    }
		
	}

	@Override
	public void receiveCustomerRequest() {
		// TODO Auto-generated method stub
		
	}
	
	private boolean doesCustomerExist(String firstName){
		return false;
	}

}
