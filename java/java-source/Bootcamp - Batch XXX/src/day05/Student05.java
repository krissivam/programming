package day05;

public class Student05 {
	// list property
	int rollNo;
	String name;
	String collage;
	// constructor
	public Student05(){
		System.out.println("Student Data :");
	}
	// constructor
	public Student05(int rollNo, String name, String collage) {
		// call constructor
		this();
		this.rollNo=rollNo;
		this.name=name;
		this.collage = collage;
	}
	// method display
	void display(Student05 object){
		System.out.println("Roll Number : "+ object.rollNo );
		System.out.println("Name :"+ object.name);
		System.out.println("College : "+ object.collage);
		System.out.println("\n");
	}
	// method call Display
	void callDisplay(){
		display(this);
	}
}


