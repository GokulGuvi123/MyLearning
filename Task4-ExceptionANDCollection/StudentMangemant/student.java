package StudentMangemant;

public class student {
	int roll_no;
	String name;
	int age;
	String Course;

	public student(int roll_no, String name, int age, String Course) {
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
		this.Course = Course;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCourse() {
		return Course;
	}
}
