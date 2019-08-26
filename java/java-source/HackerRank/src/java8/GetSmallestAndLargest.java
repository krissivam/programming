package java8;

import java.util.Scanner;

public class GetSmallestAndLargest {
	static final Scanner scan = new Scanner(System.in);
	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = largest = s.substring(0, k);

        for (int i=1; i<s.length()-k+1; i++) {
            String newstr = s.substring(i, i+k);
            if (smallest.compareTo(newstr) > 0)
                smallest = newstr;
            if (largest.compareTo(newstr) < 0)
                largest = newstr;
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
