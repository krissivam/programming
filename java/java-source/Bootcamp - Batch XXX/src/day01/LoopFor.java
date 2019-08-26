package day01;

import java.util.Scanner;

public class LoopFor {
	// create object input from class java.util.Scanner
	protected static Scanner input;

	public static void main(String[] args) {
		// create instance object input using keyword new
		input = new Scanner(System.in);
		// show text "Input your Text :" on console
		System.out.println("Input your Number : ");
		// create variable number with type int, 
		// and then grab all text from keybord and convert to int using method parseInt
		int number = Integer.parseInt(input.nextLine());
		// looping start from 0, and max number from input
		for (int i = 0; i < number; i++) {
			// show value variable i to console
			System.out.println("Your number : " + i);
		}
	}
}
