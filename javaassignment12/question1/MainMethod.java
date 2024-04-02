package javaassignment12.question1;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		Book b=new Book();
        Login login=new checkValidation();
		System.out.println("\t\tWelcome to Library\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book Details\n");
		System.out.println("Enter the Name of the Book");
		b.setName(sc.nextLine());
		System.out.println("Enter the ISBN of the Book");
		b.setIsbn(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the Genre of the Book");
		b.setGenre(sc.nextLine());
		System.out.println("Enter the Author of the Book");
	    b.setAuthor(sc.nextLine());
	    System.out.println(b.toString());
	    System.out.println("You want to update book details");
	    String choice=sc.nextLine();
	    if(choice.equals("yes")) {
          System.out.println("Enter User Name");
          String name= sc.nextLine();
          System.out.println("Enter Password");
          String password=sc.nextLine();
          if(login.checkUser(name,password)) {
            System.out.println("Enter the Updated Book Name");
            String bookName=sc.nextLine();
            b.setName(bookName);
            System.out.println(b.toString());
            System.out.println("Thank you for using Library");
          }
          else {
        	  System.out.println("Invalid User Name or Password");
          }
	    }
	    else {
	    	System.out.println("Thank you for using Library");
	    }
	}

}
