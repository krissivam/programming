package java8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagrams {
	static boolean isAnagram(String a, String b) {
		// test for invalid input   
		if( a == null || b == null || a.equals("") || b.equals("") )
		    throw new IllegalArgumentException();

		// initial quick test for non-anagrams
		if ( a.length() != b.length() )
		    return false;
		// Complete the function
		a = a.toLowerCase();
		b = b.toLowerCase();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < b.length(); i++) {
			Character c = b.charAt(i);
			if (!map.containsKey(c))
				map.put(c, 1);
			else {
				int f = map.get(c);
				map.put(c, ++f);
			}

		}

		for (int i = 0; i < a.length(); i++) {
			Character c = a.charAt(i);
			if (!map.containsKey(c))
				return false;

			int f = map.get(c);
			if(f==0)
				return false;
			else
			map.put(c, --f);

		}
		return true;
	}

	static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
