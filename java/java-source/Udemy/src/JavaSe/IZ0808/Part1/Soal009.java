package JavaSe.IZ0808.Part1;

class Student2 {
    String name;
    int age;

    void Student2() {
    	Student2("James", 25);
    }

    void Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Soal009 {
	public static void main(String[] args) {
		Student2 s = new Student2();
        System.out.println(s.name + ":" + s.age);
    }
}
