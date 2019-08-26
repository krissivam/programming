package day05;

public class Student03 {
	// list property
	int rollNo;
	String name;
	String collage;
	// constructor
	public Student03(int rollNo, String name, String collage) {
		this.rollNo=rollNo;
		this.name=name;
		this.collage = collage;
	}
	// method display
	void display(){
		System.out.println("Roll Number : "+ rollNo);
		System.out.println("Name :"+ name);
		System.out.println("College : "+ collage);
	}
}


