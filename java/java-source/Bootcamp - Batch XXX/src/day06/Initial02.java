package day06;

public class Initial02 extends Initial01 {
	// constructor
	public Initial02() {
		super();
		System.out.println("child class constructor invoked");
	}

	// constructor
	public Initial02(int x) {
		super();
		System.out.println("child class constructor invoked with :"+x);
	}

	// initializer block
	{
		System.out.println("instance initializer block is invoked");
	}

	// main method
	public static void main(String[] args) {
		// instance object1
		Initial02 object1 = new Initial02();
		// instance object2
		Initial02 object2 = new Initial02(100);
	}
}

