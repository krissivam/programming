package JavaSe.IZ0808.Part1;

class Message02 {
    String msg = "Happy New Year!";

    public void print() {
        System.out.println(msg);
    }
}

public class Soal046 {
	public static void change(Message02 m) {
        m = new Message02();
        m.msg = "Happy Holidays!";
    }

    public static void main(String[] args) {
    	Message02 obj = new Message02();
        obj.print();
        change(obj);
        obj.print();
    }
}
