package Collections_HashMAp_students;

import java.util.HashMap;
import java.util.Map;

public class students {
	private Map<String, Integer> studentGrades;

	public students() {
		studentGrades = new HashMap<>();
	}

	public void addStudent(String studentName, int garde) {
		studentGrades.put(studentName, garde);
		System.out.println("student " + studentName + " added successfully");
	}

	public void removeStudent(String studentName) {
		if (studentGrades.containsKey(studentName)) {
			studentGrades.remove(studentName);
			System.out.println("student " + studentName + " removed successfully");
		} else {
			System.out.println("Student " + studentName + " not found");
		}
	}

	public void displayGrade(String name) {
		Integer grade = studentGrades.get(name);
		if(grade != null) {
			 System.out.println("Grade of student " + name + " is: " + grade);
		}
		else {
			 System.out.println("Student " + name + " not found");
		}
	}

}
