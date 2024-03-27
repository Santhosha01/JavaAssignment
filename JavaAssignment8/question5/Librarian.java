package Inheritance.question5;

import java.util.List;

public class Librarian {
	private String name;
	private int id;
	private String password;
    private String searchString;
    private List<Book> books;
    
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSearchString() {
		return searchString;
	}
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
    public void verify_librarian() {
    	
    }
    public void search() {
    	
    }
}
