package JavaSeI.Z0808.Part2.Soal09;

import java.util.ArrayList;
import java.util.List;
 
public class Test {
     public static void main(String[] args) {
         List<String> list = new ArrayList<>();
         list.add("X");
         list.add("Y");
         list.add("X");
         list.add("Y");
         list.add("Z");
         list.remove(new String("Y"));
         System.out.println(list);
     }
}