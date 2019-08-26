package JavaSe.IZ0808.Part1;

class Student02 {
    String name;
    int marks;

    Student02(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}
public class Soal064 {
	public static void main(String[] args) {
		Student02 student = new Student02("James", 25);
        int marks = 25;
        review(student, marks);
        System.out.println(marks + "-" + student.marks);
    }

    private static void review(Student02 stud, int marks) {
        marks = marks + 10;
        stud.marks+=marks;
    }
}
