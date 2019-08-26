package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Student {
	Integer token;
	String name;
	Double gpa;

	public Student(Integer token, String name, Double gpa) {
		this.token = token;
		this.name = name;
		this.gpa = gpa;
	}

	public String getName() {
		return this.name;
	}

	public Integer getToken() {
		return this.token;
	}

	public Double getGpa() {
		return this.gpa;
	}

	public int compareTo(Student s) {
		if (this.gpa == s.gpa) {
			if (name.compareTo(s.name) == 0) {
				if (this.token == s.token)
					return 0;
				else if (this.token > s.token)
					return 1;
				else
					return -1;
			} else
				return this.name.compareTo(s.name);
		}else if(this.gpa > s.gpa)
			return -1;
		else
			return 1;
	}
}

class Priorities {
	public List<Student> getStudents(List<String> events){
		PriorityQueue < Student > student_queue = new PriorityQueue(Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName).thenComparing(Student::getToken));
		List < Student > students = new ArrayList < Student > ();
		for (String e: events) {
			Scanner in =new Scanner(e);
			String event = in.next();
			if (event.equals("ENTER")) {
				String name = in.next();
				double cgpa = in.nextDouble();
				int token = in.nextInt();

				Student student = new Student(token, name, cgpa);
				student_queue.add(student);
			} else if (event.equals("SERVED")) {
				Student first = student_queue.poll();
			} in .close();
		}
		Student first = student_queue.poll();
		if (first == null) {
			return students;
		} else {
			while (first != null) {

				students.add(first);
				first = student_queue.poll();

			}
			return students;
		}
	}
}

public class PriorityQueu {
	private final static Scanner scan = new Scanner(System.in);
	private final static Priorities priorities = new Priorities();

	public static void main(String[] args) {
		int totalEvents = Integer.parseInt(scan.nextLine());
		List<String> events = new ArrayList<>();

		while (totalEvents-- != 0) {
			String event = scan.nextLine();
			events.add(event);
		}

		List<Student> students = priorities.getStudents(events);

		if (students.isEmpty()) {
			System.out.println("EMPTY");
		} else {
			for (Student st : students) {
				System.out.println(st.getName());
			}
		}
	}
}
