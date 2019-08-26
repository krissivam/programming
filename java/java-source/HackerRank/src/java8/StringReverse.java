package java8;

import java.util.Scanner;

public class StringReverse {
	static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		String result = A.equals(new StringBuilder(A).reverse().toString())?"Yes":"No";
		System.out.println(result);
	}

}
