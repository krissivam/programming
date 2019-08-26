package JavaSe.IZ0808.Part1;

class A65 {
    public void print() {
        System.out.println("A");
    }
}

class B65 extends A65 {
    public void print() {
        System.out.println("B");
    }
}

public class Soal065 {
	public static void main(String[] args) {
        A65 obj1 = new A65();
        B65 obj2 = (B65)obj1;
        obj2.print();
    }
}
