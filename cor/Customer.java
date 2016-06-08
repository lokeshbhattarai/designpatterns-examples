package cor;

import java.io.Serializable;

public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1632927090225488360L;
	private String firstName;
	private String lastName;
	private Address address;
	private String phone;
	private String email;

	public Customer(String firstName, String lastName, Address address, String phone, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phone = phone;
		this.email = email;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEmpty(){
		try {
			return this.firstName.isEmpty() || this.lastName.isEmpty() || this.address.isEmpty() || this.phone.isEmpty() || this.email.isEmpty();
		} catch (NullPointerException e) {
			return true;
		}
	}
	
	@Override
	public String toString() {
		return "Customer name:"+this.firstName+" "+this.lastName+ "\nAddress:"+this.address.toString() +"\nPhone:"+this.phone+"\nEmail:"+this.email ;
	}
}
