package day05;

public class A4 {
	// propserty
	int data = 10;
	//constructor
	A4() {
		B4 b = new B4(this);
		b.display();
	}
	// main method
	public static void main(String args[]) {
		A4 a = new A4();
	}
}

