package factory;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileTracer implements Trace{

	String filePath = "C:\\Users\\985051\\Data\\trace.log";
	boolean isDebug = false;
	@Override
	public void setDebug(boolean debug) {
		this.isDebug = debug;
		
	}

	@Override
	public void debug(String message) {
		if(isDebug) write(message);
		
	}

	@Override
	public void error(String message) {
		if(isDebug) write(message);
		
	}

	public void write(String data){
			
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath)))) {
		    bw.write(data);
		    bw.close();
		    }catch (FileNotFoundException ex) {
		    System.out.println(ex.toString());
		    } catch (IOException e) {
				e.printStackTrace();
			}
			
	}

}
