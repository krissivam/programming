package day06;

public class Person {
	// list Property
	public int id;
	public String name;
	public String address;
	public String gender;
	// constructor class Person
	public Person() {
		System.out.println("Call Constructor Person");
	}	
	// constructor with parameter
	public Person(int id, String name, String address, String gender) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.gender = gender;
	}

	public void display(){
		System.out.println("Id : "+ this.id);
		System.out.println("Name : "+ this.name);
		System.out.println("Address : "+ this.address);
		System.out.println("Gender : "+ this.gender);
	}
}

