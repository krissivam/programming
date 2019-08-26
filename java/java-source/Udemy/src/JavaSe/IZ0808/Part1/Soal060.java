package JavaSe.IZ0808.Part1;

class SpecialString {
    String str;
    SpecialString(String str) {
        this.str = str;
    }
}

public class Soal060 {
	 public static void main(String[] args) {
         System.out.println(new String("Java"));
         System.out.println(new StringBuilder("Java"));
         System.out.println(new SpecialString("Java"));
     }
}
