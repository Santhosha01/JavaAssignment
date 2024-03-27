package Inheritance.question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookDemo {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {

	 List<Book> books=new ArrayList<>();
	   System.out.println("Enter Number of books you want to add");
	   int noOfBook=sc.nextInt();
	   sc.nextLine();
	   for(int i=0;i<noOfBook;i++) {
		   System.out.println("Enter the Name of the Book");
		   String bookName=sc.nextLine();
		   System.out.println("Enter the author of the Book");
		   String author=sc.nextLine();
		   System.out.println("Enter the ISBN of the Book");
		   long isbn=sc.nextLong();
		   System.out.println("Enter the Published year of the Book");
		   int yearPubished=sc.nextInt();
		   System.out.println("Enter the Price of the Book");
		   double price=sc.nextDouble();
		   sc.nextLine();
		   Book b=new Book(bookName,author,isbn,yearPubished,price);
		   books.add(b);
	   }
	   for(Book b:books) {
		   b.getDetails();
	   }
	}

}
