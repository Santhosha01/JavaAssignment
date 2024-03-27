package encapsulation.question1;

public class Book {

	private String title;
	private String author;
	private long isbn;
	private int yearPublished;
	private double price;
	private static String shape ="Rectangle";
	private static int tax = 60;

	public Book(String title, String author, long isbn, int yearPublished, double price) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.yearPublished = yearPublished;
		this.price = price;
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

	public long getIsbn() {
		return isbn;
	}

	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void getDetails() {
		System.out.println("Book Details : \n\n Book Title = " + title + "\n Book Author = " + author
				+ "\n Book ISBN = " + isbn + " \n Publish Year = " + yearPublished + " \n Book Price = " + price
				+ " \n Tax for the Book = " + tax +" \n Shape of the Book = "+shape+ "\n");
	}

}
