package Management_System;

public class Book {
	int bookId;
	String title;
	String author;
	boolean isAvailable;

	public Book(int bookId, String title, String author) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isAvailable = true; // By default any book added isAvilable will be true.
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Boolean getIsAvailable() {
		return isAvailable;
	}

	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Book Id : " + bookId + ", Title : " + title + ", Author : " + author + ", Available : "
				+ (isAvailable ? "Yes" : "No");
	}
}
