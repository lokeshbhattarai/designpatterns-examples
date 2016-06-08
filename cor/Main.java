package cor;

import java.util.List;

public class Main {
	 public static void main(String[] args){
		 ChainBuilder.getBuilder().buildChain();
		 
		 List<CallRecord> records = Record.getRecords();
		 for (CallRecord callRecord : records) {
			 ChainBuilder.getBuilder().getHandler().handleRecord(callRecord);
		}
		 
	 }
}
