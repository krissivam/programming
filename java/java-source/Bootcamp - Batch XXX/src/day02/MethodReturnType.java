package day02;

public class MethodReturnType {

	public static void main(String[] args) {
		int a = 11;
		int b = 6;
		// calling method minFunction
		// with parameter variable a, and variable b
		// variable a and variable b must be same data type 
		// with parameter at method minFuncation 
		int c = minFunction(a, b);
		System.out.println("Minimum Value = " + c);
	}

	/** returns the minimum of two numbers */
	public static int minFunction(int n1, int n2) {
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;

		return min;
	}
}
