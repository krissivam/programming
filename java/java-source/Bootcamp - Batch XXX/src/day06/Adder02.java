package day06;

public class Adder02 {
	// add method
	static int add(int a, int b) {
		return a + b;
	}
	// add method
	static double add(double a, double b) {
		return a + b;
	}
	// main method
	public static void main(String[] args) {
		// call add method
		System.out.println(Adder02.add(11, 11));
		// call add method
		System.out.println(Adder02.add(11.5, 11.5));
	}
}

