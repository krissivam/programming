package java8;

import java.util.Scanner;

public class Loops2 {
	private static final Scanner in = new Scanner(System.in);

	public static void main(String []argh){
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int x=0; x < n; x++){
                a = a+b;
                System.out.print(a +" ");
                b = b*2;
            }
            System.out.println();
        }
        in.close();
    }
	
	public static void solution2(){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int hasil = a;
            for(int x=0; x < n; x++){
                int kali = (int)Math.pow(2,x) * b;
                hasil = hasil + kali;
                System.out.print(hasil +" ");
            }
            System.out.println();
        }
        in.close();
    }
}
