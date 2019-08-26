package java8;

import java.util.Scanner;

public class StringToken {
	static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String s = "                        ";// scan.nextLine();

		// Write your code here.
		String reg = "[ !,?.\\_'@]+";
		// Write your code here.
		String[] array = s.trim().split(reg);
		if (s.trim().length() == 0 || s.trim().equals("")) {
			System.out.println("0");
		} else if (s.length() > 400000) {
			return;
		} else {
			System.out.println(array.length);
		}
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		scan.close();
		/*
		 * String[] items = s.trim().split("[ !,?.\\_'@]+");
		 * 
		 * if(s == ""){ System.out.println("0"); } else if(s.length() > 400000){ return;
		 * } else{ System.out.println(items.length); }
		 * 
		 * for(String item: items){ System.out.println(items); }
		 */
	}
}
