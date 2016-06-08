package cor;

public class Reporter extends DataProcessor{

	@Override
	public void handleRecord(CallRecord callRecord) {
		if(callRecord.isASalesLead()){
			System.out.println("==========================");
			System.out.println(callRecord.toString());
			System.out.println("==========================");
		}else{
			//ignore non-sales records for now
		}
	
		
	}

}
