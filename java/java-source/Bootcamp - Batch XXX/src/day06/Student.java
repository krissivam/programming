package day06;

public class Student extends Person {
	// list property
	public String major;
	public Double grade;
	// constructor class Student
	public Student() {
		super();
		System.out.println("Call Constructor Student");
	}	
	public Student(int id, String name, String address, String gender,
			String major, Double grade) {
		super(id, name, address,gender);
		this.major = major;
		this.grade = grade;
	}
	public void info(){
		System.out.println("Id : "+ super.id);
		System.out.println("Name : "+ super.name);
		System.out.println("Major : "+ this.major);
		System.out.println("Grade : "+ this.grade);
	}	
	public void display(){
		// call method from Person
		super.display();
		System.out.println("Major : "+ this.major);
		System.out.println("Grade : "+ this.grade);
	}
}


