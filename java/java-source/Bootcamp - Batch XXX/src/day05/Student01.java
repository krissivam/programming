package day05;

public class Student01 {
	// list property
	int rollNo;
	String name;
	static String collage = "ITS";
	// constructor
	public Student01(int r, String n) {
		rollNo=r;
		name=n;
	}
	// method display
	void display(){
		System.out.println("Roll Number : "+ rollNo);
		System.out.println("Name :"+ name);
		System.out.println("College : "+ collage);
	}
}


