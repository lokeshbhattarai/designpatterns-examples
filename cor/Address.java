package cor;

import java.io.Serializable;

public class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8841665197355784040L;
	private String streetAddress;
	private String city;
	private String state;
	private String zipcode;
	public Address(String streetAddress, String city, String state, String zipcode) {
		super();
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public boolean isEmpty(){
		return this.streetAddress.isEmpty() || this.city.isEmpty() || this.state.isEmpty() || this.zipcode.isEmpty();
	}
	@Override
	public String toString() {
		return "Street:"+this.streetAddress+ " City:"+this.city+ "State:"+this.state + " Zipcode:"+this.zipcode;
	}
}
