package day01;

import java.util.Scanner;

public class InputOutput {
	// create object input from class java.util.Scanner
	protected static Scanner input;
	public static void main(String[] args) {
		// create instance object input using keyword new
		input = new Scanner(System.in);
		// show text "Input your Text :" on console
		System.out.println("Input your Text : ");
		// create variable text, grab all text from keybord 
		String text= input.nextLine();
		// show value text to console
		System.out.println("Your text is : "+ text);
	}
}
