package day05;

public class Student04 {
	// list property
	int rollNo;
	String name;
	String collage;
	// constructor
	public Student04(){
		System.out.println("Student Data :");
	}
	// constructor
	public Student04(int rollNo, String name, String collage) {
		// call constructor
		this();
		this.rollNo=rollNo;
		this.name=name;
		this.collage = collage;
	}
	// method display
	void display(){
		System.out.println("Roll Number : "+ rollNo);
		System.out.println("Name :"+ name);
		System.out.println("College : "+ collage);
		System.out.println("\n");
	}
}


