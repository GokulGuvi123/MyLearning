package Management_System;

public class Library {
	final int capacity = 10;
	Book[] books = new Book[capacity];
	int NumOfBooksInLib = 0 ;

	public void addBook(Book book) {
		if(NumOfBooksInLib < capacity) {
			books[NumOfBooksInLib++]  = book;
			System.out.println("Book added successfully.");
		}
		else {
			System.out.println("Library is full. Cannot add more books.");
		}
	}

	public void removeBook(int bookId) {
		boolean found = false;
		for (int i = 0; i < NumOfBooksInLib; i++) {
			if (books[i].getBookId() == bookId) {
				books[i].setIsAvailable(false);
				System.out.println("Book removed Successfully");
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Book with ID " + bookId + " not found in the Library");
		}
	}

	public Book searchBook(int searchId) {
		for (int i = 0; i < NumOfBooksInLib; i++) {
			if (books[i].getBookId() == searchId) {
				return books[i];
			}
		}
		return null;
	}

	public void displayBooks() {
		if (NumOfBooksInLib > 0) {
			System.out.println("Books in the Library:");
			for (int i = 0; i < NumOfBooksInLib; i++) {
				System.out.println(books[i]);
			}
		} else {
			System.out.println("No books in the library.");
			return;
		}
	}
}
