package day06;

public class Adder {
	// add method
	static int add(int a, int b) {
		return a + b;
	}
	// add method 
	static int add(int a, int b, int c) {
		return a + b + c;
	}
	// main method
	public static void main(String[] args) {
		// call add method
		System.out.println(Adder.add(11,11));  
		// call add method
		System.out.println(Adder.add(11,11,11)); 
	}

}

