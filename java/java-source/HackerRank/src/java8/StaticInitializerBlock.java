package java8;

import java.util.Scanner;

public class StaticInitializerBlock {
	static int B;
	static int H;
	static Boolean flag=false;
	static final Scanner scn = new Scanner(System.in);
	static {
	    B = scn.nextInt();
	    H=scn.nextInt();
	    if(B > 0 && H > 0){
	        flag=true;
	    }else {
	        System.out.print("java.lang.Exception: Breadth and height must be positive");
	    }
	}


	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}
