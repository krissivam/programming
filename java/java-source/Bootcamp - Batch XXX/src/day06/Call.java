package day06;

public class Call {
	// invoke metod
	void invoke(Printable p) {
		if(p instanceof A04) {
			// downcasting
			A04 a = (A04)p;
			a.methodA();
		}
		
		if(p instanceof B04) {
			// downcasting
			B04 b = (B04)p;
			b.methodB();
		}
	}
	// main method
	public static void main(String[] args) {
		Printable p = new B04();
		Call c = new Call();
		c.invoke(p);
	}
}

