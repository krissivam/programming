package java8;

import java.util.Scanner;

public class StdinAndStdout2 {
	static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
        
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();
        // Write your code here.
        String s = scan.nextLine();

        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

}
