package JavaSe.IZ0808.Part1;

public class Soal053 {
	public static void main(String[] args) {
		double price = 90000;
		String model="";
		if (price > 100000) {
			model = "Tesla Model X";
		} else if (price <= 100000) {
			model = "Tesla Model S";
		}
		System.out.println(model);
	}
}
