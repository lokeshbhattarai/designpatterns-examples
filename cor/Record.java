package cor;

import java.util.ArrayList;
import java.util.List;

public class Record {

	public static final String filePath = "/home/lokex/unicorn/cor.txt";
	private static List<CallRecord> CALL_RECORDS = new ArrayList<>();
	
	public static List<CallRecord> getRecords(){
		
		Address mumAdress = new Address("1000 N 4th St.", "Fairfield", "IA", "52557");
		Address address2 = new Address("855 N 2nd St.", "Fairfield", "IA", "52557");
		
		Agent agent1 = new Agent("1", null);
		Agent agent2 = new Agent("2",mumAdress);
		
		Customer customer1 = new Customer("Bob","Harris",mumAdress,"641-451-9854","bob@gmail.com");
		Customer customer2 = new Customer("Will","Harington",mumAdress,"641-461-9674","will@gmail.com");
		Customer customer3 = new Customer("Jack","Nicolson",address2,"641-125-3654","theshinning@gmail.com");
		
		CALL_RECORDS.add(new CallRecord(customer1, agent1, "Enquiry"));
		CALL_RECORDS.add(new CallRecord(customer3, agent2, "Request"));
		CALL_RECORDS.add(new CallRecord(customer2, agent2, "Order"));
		CALL_RECORDS.add(new CallRecord(customer1, agent1, "Order"));
		CALL_RECORDS.add(new CallRecord(customer3, agent2, "Enquiry"));
		CALL_RECORDS.add(new CallRecord(customer2, agent2, "Sales"));
		
		return CALL_RECORDS;
	}
	
}
