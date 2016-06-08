package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Cloneable, Serializable {

	private int id;
	private String firstName;
	private String lastName;
	private Employee supervisor;
	private Employee staff[];
	
	@Override
	public String toString() {
		 
		return this.getFirstName();
	}
	
	@Override
	protected Object clone(){
	//implement deep copy 
		
		Employee emp = new Employee();
		emp.id = this.id;
		emp.firstName = this.firstName;
		emp.lastName = this.lastName;
		
		emp.supervisor = (Employee)getDeepCopy(this.supervisor);
		emp.staff = (Employee[])getDeepCopy(this.staff);
		
		return emp;
	}
	
	private Object getDeepCopy(Object sourceObj){
		Object resultObj;
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(bos);
			oos.writeObject(sourceObj);
			oos.flush(); 
			oos.close();
			bos.close();
			byte[] byteData = bos.toByteArray();
			
			//Restore your class from a stream of bytes:
			ByteArrayInputStream bais = new ByteArrayInputStream(byteData);
			resultObj = (Object) new ObjectInputStream(bais).readObject();
			return resultObj;			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Employee getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Employee supervisor) {
		this.supervisor = supervisor;
	}

	public Employee[] getStaff() {
		return staff;
	}

	public void setStaff(Employee[] staff) {
		this.staff = staff;
	}
	
}