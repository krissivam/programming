package day05;

public class Student02Main {

	public static void main(String[] args) {
		//call method change from class Student
		Student02.change();
		// create object s1 using call constructor
		Student02 s1 = new Student02(111, "Ahmad Roni");
		s1.display();
		// create object s2 using call constructor
		Student02 s2 = new Student02(222, "Atur Aritonang");
		s2.display();
	}
}

