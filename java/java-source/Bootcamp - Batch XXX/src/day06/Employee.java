package day06;

public class Employee {
	// list property
	int id;
	String name;
	String gender;
	// agregation
	Address address;
	
	public Employee(int id, String name, String gender, Address address) {
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.address=address;
	}
	
	public static void main(String[] args) {
		Address addr01 = new Address(1,"st.Ahmad Dahlan",
				"Yoyakarta", "Yogyakarta","Indonesia",12345);
		
		Employee emp01=new Employee(123, "Ahmad Roni", "Male", addr01);
		
		Employee emp02=new Employee(124, "Ahmad Imam", "Male", addr01);
	}
}

