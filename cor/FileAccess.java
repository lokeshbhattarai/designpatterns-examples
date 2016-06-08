package cor;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileAccess {
	private String filePath;

	public FileAccess(String filePath){
		this.filePath = filePath;
	}

	public void write(Object data){
		try {
				FileOutputStream fos = null;
				ObjectOutputStream out = null;
		      	fos = new FileOutputStream(filePath);
		      	out = new ObjectOutputStream(fos);
		      	out.writeObject(data);

		      	out.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@SuppressWarnings("resource")
	public Object read(){
		try {
				FileInputStream fis = null;
				ObjectInputStream in = null;
				fis = new FileInputStream(filePath);
				int availableBytes = fis.available();
				if(availableBytes > 0){
					in = new ObjectInputStream(fis);
					Object p = in.readObject();
					in.close();
					return p;
				}
				else{
					return null;
				}
		}
		catch (Exception ex) {
		     	ex.printStackTrace();
		     	return null;
		}
	}
}
