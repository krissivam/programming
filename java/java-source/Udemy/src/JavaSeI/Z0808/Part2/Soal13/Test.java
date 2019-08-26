package JavaSeI.Z0808.Part2.Soal13;

import java.util.function.Predicate;

public class Test {
	 public static void main(String[] args) {
         String [] arr = {"*", "**", "***", "****", "*****"};
        // Predicate pr1 = s -> s.length() < 4;
        // print(arr, pr1);
     }
 
     private static void print(String [] arr, Predicate<String> predicate) {
         for(String str : arr) {
             if(predicate.test(str)) {
                 System.out.println(str);
             }
         }
     }
}


