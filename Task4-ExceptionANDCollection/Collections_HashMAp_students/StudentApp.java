package Collections_HashMAp_students;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		students StudentGradeManager = new students();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nMenu");
			System.out.println("1.Add student");
			System.out.println("2.Remove student");
			System.out.println("3.Display student Grade");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");

			int choice = scanner.nextInt();
			scanner.nextLine(); // consume new line
			switch (choice) {
			case 1:
				System.out.println("Enter Student name to add :");
				String addName = scanner.nextLine();
				System.out.println("Enter Student Grade :");
				int grade = scanner.nextInt();
				StudentGradeManager.addStudent(addName, grade);
				break;
			case 2:
				System.out.println("Enter Student name to remove:");
				String removeName = scanner.nextLine();
				StudentGradeManager.removeStudent(removeName);
				break;
			case 3:
				System.out.println("Enter Student name to display grade:");
				String studentName = scanner.nextLine();
				StudentGradeManager.displayGrade(studentName);
				break;
			case 4:
				System.out.println("Exiting");
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice, please try again.");
			}
		}

	}
}
