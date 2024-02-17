package Exception_Handling;

import java.util.Scanner;

public class StudentManagement {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = scanner.nextInt();
		scanner.nextLine(); // to Move next line
		student[] students = new student[n]; // Array to store students
		for (int i = 0; i < n; i++) {
			System.out.println("Roll Number: ");
			int roll_no = scanner.nextInt();
			scanner.nextLine();

			int age;
			while (true) {
				System.out.println("Age: ");
				age = scanner.nextInt();
				scanner.nextLine();
				try {
					validateAge(age);
					break;
				} catch (AgeNotWithInRangeException e) {
					System.out.println("Error: " + e.getMessage());
				}
			}

			String name;
			while (true) {
				System.out.println("Name: ");
				name = scanner.nextLine();
				try {
					validateName(name);
					break;
				} catch (NameNotValidException e) {
					System.out.println("Error creating student Name: " + e.getMessage());
				}
			}

			System.out.println("Course: ");
			String Course = scanner.nextLine();
			students[i] = new student(roll_no, name, age, Course);
		}
		scanner.close();
		System.out.println("\nDetails of created students:");
		for (student stud : students) {
			System.out.println("Roll No: " + stud.getRoll_no());
			System.out.println("Name: " + stud.getName());
			System.out.println("Age: " + stud.getAge());
			System.out.println("Course: " + stud.getCourse());
			System.out.println();
		}
	}

	private static void validateAge(int age) throws AgeNotWithInRangeException {
		if (age < 15 || age > 21) {
			throw new AgeNotWithInRangeException("Age should be between 15 and 21");
		}
	}

	private static void validateName(String name) throws NameNotValidException {
		if (!name.matches("[a-zA-Z\\s]+")) {
			throw new NameNotValidException("Name should only contain alphabets and spaces");
		}
	}
}
