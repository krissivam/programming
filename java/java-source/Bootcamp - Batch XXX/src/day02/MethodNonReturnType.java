package day02;

public class MethodNonReturnType {

	public static void main(String[] args) {
		// initial variable number with type double
		double number = 255.7;
		// call methodRankPoint and give value number to paramaters
		methodRankPoints(number);
	}

	// method Rank Points
	public static void methodRankPoints(double points) {
		if (points >= 202.5) {
			System.out.println("Rank:A1");
		} else if (points >= 122.4) {
			System.out.println("Rank:A2");
		} else {
			System.out.println("Rank:A3");
		}
	}
}
