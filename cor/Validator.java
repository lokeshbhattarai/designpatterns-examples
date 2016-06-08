package cor;

import java.util.ArrayList;
import java.util.List;

public class Validator extends DataProcessor{

	FileAccess fileAccess;
	@SuppressWarnings("unchecked")
	@Override
	public void handleRecord(CallRecord callRecord) {
		if(callRecord.isEmpty()){
			System.out.println("Record is empty so writing to discarded files");
			
			if(fileAccess==null)fileAccess = new FileAccess(Record.filePath);
			
			List<CallRecord> record=null;
			try {
				record = (List<CallRecord>)fileAccess.read();
			} catch (ClassCastException e) {
				e.printStackTrace();
			}
			
			if(record==null)record = new ArrayList<>();
			
			record.add(callRecord);
			fileAccess.write(record);
			
			
		}else{
			System.out.println("Record is validated so passing to next processor");
			if(this.nextProcessor!=null){
				callRecord.setValid(true);
				this.nextProcessor.handleRecord(callRecord);
			}
		}
		
	}

}
