package Inheritance.question5;

import java.util.List;

public class User {
	private String userName;
	private int userId;
    private Account account;
	private List<Book> books;
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	public void verify() {
		
	}
	public void checkAccount() {
		
	}
	public void get_book_info() {
		
	}

}
