package day02;

public class ConditionNestedIf {
	public static void main(String[] args) {
		// initial variable x with data type int
		int x = 30;
		// initial variable y with data type int
		int y = 20;
		// condition if value of variable x = 30
		if (x == 30) {
			// condition if value variable y = 20
			if (y == 20) {
				System.out.print("This is if value x = 30 and value y = 20");
			}
			// statement if condition false
		} else {
			System.out.println("This is x not equal 30");
		}
	}
}


