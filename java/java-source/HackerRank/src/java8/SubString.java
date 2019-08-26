package java8;

import java.util.Scanner;

public class SubString {
	static final  Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
    }
}
