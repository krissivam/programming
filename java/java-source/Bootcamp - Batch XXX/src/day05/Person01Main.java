package day05;

public class Person01Main {
	public static void main(String[] args) {
		// initial by reference
		Person01 person = new Person01();
		
		// initial by method
		// insert new data
		person.setId(1);
		person.setName("Ahmad Roni");
		person.setAddres("Jakarta");
		person.setAge(25);
		
		// show data
		System.out.println("Id : "+person.getId());
		System.out.println("Name : "+person.getName());
		System.out.println("Alamat : "+ person.getAddres());
		System.out.println("Umur : "+ person.getAge());
		
	}
}

