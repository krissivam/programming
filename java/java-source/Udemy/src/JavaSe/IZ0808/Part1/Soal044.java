package JavaSe.IZ0808.Part1;
class A01 {
    public int i1 = 1;
    protected int i2 = 2;
}
public class Soal044 extends A01 {
	public void print() {
        A01 obj = new A01();
        System.out.println(obj.i1); //Line 8
        System.out.println(obj.i2); //Line 9
        System.out.println(this.i2); //Line 10
        System.out.println(super.i2); //Line 11
    }
	
	public static void main(String [] args) {
        new Soal044().print();
    }
}
