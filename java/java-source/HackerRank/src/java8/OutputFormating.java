package java8;

import java.util.Scanner;

public class OutputFormating {
	static final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
        
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%s %n",s1,String.format("%03d",x));
        }
        System.out.println("================================");

}
}
