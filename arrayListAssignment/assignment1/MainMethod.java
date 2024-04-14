package arrayListAssignment.assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainMethod {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		List<Book> books=new ArrayList<>();
		initprocess(books);
	}
   private static void initprocess(List<Book> books) {
	System.out.println("\nWelcome to Library");
	System.out.println("\n 1.Add book \n 2.update book \n 3.delete book \n 4.view Books \n 5.Exit");
	System.out.println("\nEnter your choice");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:
		addbook(books);
		break;
	case 2:
		updatebook(books);
		break;
	case 3:
		deletebook(books);
		break;
	case 4:
		viewbooks(books);
		break;
	case 5:
		System.exit(0);
		break;
	default:
		System.out.println("Invalid input");
	}
	}

	private static void viewbooks(List<Book> books) {
		int i=1;
	   for(Book b:books) {
		   System.out.println("Details of Book "+i+++"\n");
		   System.out.println(b.toString());
	   }
	   initprocess(books);
    }
	private static void deletebook(List<Book> books) {	
	  System.out.println("Enter the ISBN of the book you want to delete");
	  int deleteIsbn=sc.nextInt();
	  int flag=0;
	  for(Book b:books) {
         if(b.getIsbn()==deleteIsbn)
         {  flag=1;
			  books.remove(b);
			  System.out.println("Book deleted successfully");
		  }
	     if(flag==1) {
	    	 break;
	     }
	  }
	  if(flag==0) {
		  System.out.println("Book not Found");
	  }
	  initprocess(books);
	}

	private static void updatebook(List<Book> books) {
         System.out.println("Enter the ISBN of the Book you want to update");
         int update=sc.nextInt();
         int flag=0;
         for(Book b:books) {
        	 if(b.getIsbn()==update) {
        		 System.out.println("Enter the Updated Price");
        		 int updatePrice=sc.nextInt();
        		 flag=1;
        		 b.setPrice(updatePrice);
        		 System.out.println("Book details Updated successfully");
        	 }
         }
         if(flag==0) {
        	 System.out.println("Book not found");
         }
         initprocess(books);
	}
	
	private static void addbook(List<Book> books) {
         System.out.println("Enter the Number of books you want to add");
         int numberofbooks=sc.nextInt();
         sc.nextLine();
         while(numberofbooks>0) {
             Book b=new Book();
     		System.out.println("Enter Book Details :");
     		System.out.println("\nEnter the Name of the Book");
     		b.setTitle(sc.nextLine());
     		System.out.println("Enter the ISBN of the Book");
     		b.setIsbn(sc.nextInt());
     		sc.nextLine();
     		System.out.println("Enter the Author of the Book");
     	    b.setAuthor(sc.nextLine());
       	    System.out.println("Enter the publication year of the Book");
     		b.setYearPublished(sc.nextInt());
    		sc.nextLine();
    		System.out.println("Enter the price of the Book");
    		b.setPrice(sc.nextDouble());
    		sc.nextLine();
     	    books.add(b);
     	    numberofbooks--;
         }
         initprocess(books);
	}

}
