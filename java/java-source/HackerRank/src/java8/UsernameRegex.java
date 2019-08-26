package java8;

import java.util.Scanner;

public class UsernameRegex {
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int n = Integer.parseInt(scan.nextLine());
		while (n-- != 0) {
			String userName = scan.nextLine();

			if (userName.matches(UsernameValidator.regularExpression)) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}
}

class UsernameValidator {
	/*
	 * Write regular expression here.
	 */
	String pattern = "^[A-ZA-z]\\w{7,29}$";
	public static final String regularExpression = "^[A-Za-z]\\w{7,29}$";
}