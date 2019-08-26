package day06;

public class Buffallo extends Animal {
	// eat method
	void eat() {
		System.out.println("eating green grass");
	}
	
	public static void main(String[] args) {
		Buffallo b1 = new Buffallo();
		b1.eat();
		System.out.println(b1 instanceof Animal);
	}
}

