package Inheritance.question5;

import java.util.List;

public class LibraryDatabase {
	private List<Book> list_of_books;
	private List<Account> accounts;
	private Librarian librarian;

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public Librarian getLibrarian() {
		return librarian;
	}

	public void setLibrarian(Librarian librarian) {
		this.librarian = librarian;
	}

	public List<Book> getList_of_books() {
		return list_of_books;
	}

	public void setList_of_books(List<Book> list_of_books) {
		this.list_of_books = list_of_books;
	}

}
