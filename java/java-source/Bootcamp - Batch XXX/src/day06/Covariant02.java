package day06;

public class Covariant02 {
	Covariant02 get() {
		return this;
	}

	void message() {
		System.out.println("welcome to covariant return type");
	}

	public static void main(String args[]) {
		new Covariant02().get().message();
	}
}

