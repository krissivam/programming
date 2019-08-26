package day05;

public class B4 {
	// property
	A4 obj;
	// constructor
	B4(A4 obj) {
		this.obj = obj;
	}
	// display method
	void display() {
		// using data member of A4 class
		System.out.println(obj.data);
	}
}

