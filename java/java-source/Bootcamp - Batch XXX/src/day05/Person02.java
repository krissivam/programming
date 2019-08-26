package day05;

public class Person02 {
	// property or state
	private int id;
	private String name;
	private String address;
	private int age;
	// contructor
	public Person02(int id, String name, String addr, int age) {
		this.id = id;
		this.name=name;
		this.address=addr;
		this.age=age;
	}
	// method show data
	public void showData(){
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
		System.out.println("Alamat : "+ this.address);
		System.out.println("Umur : "+ this.age);
	}
}



