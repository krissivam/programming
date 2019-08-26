package JavaSe.IZ0808.Part1;

public class Soal008 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		String s1 = sb.toString();
		String s2 = sb.toString();

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}
}
