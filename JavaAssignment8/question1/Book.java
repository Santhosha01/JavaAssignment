package Inheritance.question1;

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

		public void getDetails() {
			System.out.println("Book Details : \n\n Book Title = " + title + "\n Book Author = " + author
					+ "\n Book ISBN = " + isbn + " \n Publish Year = " + yearPublished + " \n Book Price = " + price
					+ " \n Tax for the Book = " + tax +" \n Shape of the Book = "+shape+ "\n");
		}

}
