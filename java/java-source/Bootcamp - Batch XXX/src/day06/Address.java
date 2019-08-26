package day06;

public class Address {
	// list propserty
	int id;
	String street;
	String city;
	String state;
	String country;
	int zipCode;
	
	public Address(int id, String street, 
			String city, String state, 
			String country, int zipCode) {
		this.id=id;
		this.street=street;
		this.city= city;
		this.state= state;
		this.country=country;
		this.zipCode=zipCode;
	}
}

