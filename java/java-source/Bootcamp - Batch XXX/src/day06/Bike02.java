package day06;

public class Bike02 {
	// property
	int speed;
	// constructor
	public Bike02() {
		System.out.println("Speed Bike is :" + speed);
	}
	// initializer block
	{
		speed = 100;
		System.out.println("instance initializer block invoked");
	}
	// main method
	public static void main(String[] args) {
		Bike02 b1 = new Bike02();
		Bike02 b2 = new Bike02();
	}
}

