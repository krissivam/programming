package day05;

public class Person03 {
	// property or state
	private int id;
	private String name;
	private String address;
	private int age;
	// contructor 1
	public Person03() {
	
	}
	// contructor 2
	public Person03(int id, String name) {
		this.id = id;
		this.name = name;
	}
	// contructor 3
	public Person03(int id, String name, String addr, int age) {
		this.id = id;
		this.name = name;
		this.address = addr;
		this.age = age;
	}
	// method show data
	public void showData() {
		System.out.println("Id : " + this.id);
		System.out.println("Name : " + this.name);
		System.out.println("Alamat : " + this.address);
		System.out.println("Umur : " + this.age);
	}
}


