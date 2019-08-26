package day02;

public class MetodOverloadingExample2 {
	public static void main(String[] args) {
		// calling method add
		System.out.println(add(11, 11));
		// calling method add
		System.out.println(add(12.3,12.6));  
	}

	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		return a + b;
	}
}

