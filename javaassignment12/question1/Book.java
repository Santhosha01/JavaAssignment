package javaassignment12.question1;

public class Book {
	private String name;
	private int isbn;
	private String genre;
	private String author;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Books Details : \n\n Book Name = " + name + "\n ISBN = " + isbn + "\n Genre = " + genre + "\n Author = " + author;
	}

}
