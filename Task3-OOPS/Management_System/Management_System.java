package Management_System;

import java.util.Scanner;

public class BookManagementSystem {

	public static void main(String[] args) {
		Library library = new Library();
		Scanner scanner = new Scanner(System.in);
		boolean isExit = false;
		while (!isExit) {
			System.out.println("Menu:");
			System.out.println("Enter 1 for Add a new Book");
			System.out.println("Enter 2 for Remove Book");
			System.out.println("Enter 3 for Search a Book");
			System.out.println("Enter 4 for Display Books");
			System.out.println("Enter 5 for Exit");

			int userChoice = scanner.nextInt();
			switch (userChoice) {
			case 1:
				System.out.println("Enter Book ID :");
				int bookId = scanner.nextInt();
				scanner.nextLine(); // consume newLine
				System.out.println("Enter Title :");
				String title = scanner.nextLine();
				System.out.println("Enter Author :");
				String author = scanner.nextLine();
				Book newBook = new Book(bookId, title, author);
				library.addBook(newBook);
				break;
			case 2:
				System.out.println("Enter Book ID to remove: ");
				int removeId = scanner.nextInt();
				library.removeBook(removeId);
				break;
			case 3:
				System.out.println("Enter Book Id to search: ");
				int searchId = scanner.nextInt();
				Book foundBook = library.searchBook(searchId);
				if (foundBook != null) {
					System.out.println("Book Found :" + foundBook);
				} else {
					System.out.println("Book not found!!");
				}
				break;
			case 4:
				library.displayBooks();
				break;
			case 5:
				isExit = true;
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
		scanner.close();
	}
}
