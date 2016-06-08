package builder;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		 
		RequestDirector requestDirector = new RequestDirector(new SalesRequestBuilder());
		requestDirector.handleRequest(new Agent("1"),  ""+(new Date()).getTime());

	}

}
