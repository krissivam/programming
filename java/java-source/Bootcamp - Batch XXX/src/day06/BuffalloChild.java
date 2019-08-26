package day06;

public class BuffalloChild extends Buffallo {
	// eat method
	void eat() {
		System.out.println("eating milk");
	}
	
	public static void main(String[] args) {
		// initial object a1, a2, a3
		Animal a1, a2, a3;
		// intanciated object a1, a2, a3
		a1 = new Animal();
		a2 = new Buffallo();
		a3 = new BuffalloChild();
		// call method eat
		a1.eat();
		a2.eat();
		a3.eat();
	}
}

