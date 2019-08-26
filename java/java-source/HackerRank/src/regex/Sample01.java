package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample01 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		Boolean b1 = m.matches();
		System.out.println("b1 => "+ b1);
		
		Boolean b2 = Pattern.compile(".s").matcher("as").matches();
		System.out.println("b2 => "+ b2);
		
		Boolean b3 = Pattern.matches(".s","as");
		System.out.println("b3 => "+b3);
		
		// .(dot) represent single character
		System.out.println(Pattern.matches(".s", "as"));
		System.out.println(Pattern.matches(".s", "mk"));
		System.out.println(Pattern.matches(".s", "mst"));
		System.out.println(Pattern.matches(".s", "amms"));
		System.out.println(Pattern.matches("..s", "mas"));
	}
}
