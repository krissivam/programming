package JavaSe.IZ0808.Part1;
import java.time.LocalDate;
public class Soal055 {
	public static void main(String[] args) {
		LocalDate newYear = LocalDate.of(2018, 1, 1);
		LocalDate christmas = LocalDate.of(2018, 12, 25);
		boolean flag1 = newYear.isAfter(christmas);
		boolean flag2 = newYear.isBefore(christmas);
		System.out.println(flag1 + ":" + flag2);
	}
}
