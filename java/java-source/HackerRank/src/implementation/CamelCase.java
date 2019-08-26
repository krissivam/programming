package implementation;

public class CamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static int camelCase(String str) {
		return str.length() - str.replaceAll("[A-Z]", "").length() + 1;
	}

}
