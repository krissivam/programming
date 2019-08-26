package java8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * int testCases = Integer.parseInt(in.nextLine()); while (testCases > 0) {
		 * String line = in.nextLine(); String regex = "<[^>]*>";
		 * System.out.println(line.replaceAll(regex, "")); // Write your code here
		 * 
		 * testCases--; }
		 */
		String[] strHtml = { "<h1>Nayeem loves counseling</h1>",
				"<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>",
				"<Amee>safat codes like a ninja</amee>", "<SA premium>Imtiaz has a secret crush</SA premium>" };
		for (int i = 0; i < strHtml.length; i++) {

			// match html tag
			boolean matchFound = false;
			Pattern ptr = Pattern.compile("<(.+)>([^<]+)</\\1>");
			Matcher match = ptr.matcher(strHtml[i]);

			while (match.find()) {
				System.out.println(match.group(2));
				matchFound = true;
			}
			if (!matchFound) {
				System.out.println("None");
			}
		}
	}
}
