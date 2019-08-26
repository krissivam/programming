package day02;

public class MetodExample {
	// syntax
	public static int methodName(int a, int b) {
		// body
		return 0;
	}
	
	public static void methodName() {
		System.out.println("This is a void method in java");
		System.out.println("This method not return a value");
		System.out.println("Method is called");
	}

	public static int minFunction(int n1, int n2) {
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;

		return min;
	}
}

