package cor;

public class DataWasher extends DataProcessor{

	@Override
	public void handleRecord(CallRecord callRecord) {
		if(callRecord.isValid()){
			if(callRecord.getRequestInformation().contains("Sales")){
				//passing sales record to report generator
				callRecord.setASalesLead(true);
				if(this.nextProcessor!=null){
					this.nextProcessor.handleRecord(callRecord);
				}
				
			}else{
				System.out.println("Non sales record.");
			}
		}else{
			System.out.println("Invalid record found. Just ignoring now.");
		}
		
	}

}
