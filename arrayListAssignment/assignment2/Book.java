package arrayListAssignment.assignment2;

public class Book {
		private String title;
		private String author;
		private long isbn;
		private int yearPublished;
		private double price;
		
		@Override
		public String toString() {
			return "Title = " + title + "\n Author = " + author + "\n ISBN = " + isbn + "\n Year Published = " + yearPublished
					+ "\n Price = " + price +"\n";
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

       
}
