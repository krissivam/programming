package day05;

public class Student02 {
	// list property
	int rollNo;
	String name;
	static String collage = "ITS";
	// constructor
	public Student02(int r, String n) {
		rollNo=r;
		name=n;
	}
	// method change property collage
	static void change(){
		collage="ITS Change";
	}
	// method display
	void display(){
		System.out.println("Roll Number : "+ rollNo);
		System.out.println("Name :"+ name);
		System.out.println("College : "+ collage);
	}
}


