package Collections_Stack_DataStrcture;

import java.util.EmptyStackException;
import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter stack size");
		int size = scanner.nextInt();
		Instack stack = new Instack(size);

		while (true) {
			System.out.println("\nMenu");
			System.out.println("1 To push in stack.");
			System.out.println("2 To Pop in stack.");
			System.out.println("3 Exit.");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter element to push");
				int ele = scanner.nextInt();
				stack.push(ele);
				break;
			case 2:
				try {
					stack.pop();
				} catch (EmptyStackException e) {
					System.out.println("Tried to pop from an empty stack: " + e.getMessage());
				}
				break;
			case 3:
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
