package javaassigment10.question3.library;

import java.util.Scanner;

import javaassigment10.question3.library.books.Books;
import javaassigment10.question3.library.members.Members;

public class MainMethod {

	public static void main(String[] args) {
		Books b=new Books();
		System.out.println("Welcome to Library\n");
		Scanner sc=new Scanner(System.in);
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
	    Members m=new Members();
//	    private String name;
//		private int id;
//		private String type;
//		private long phoneNumber;
//		private String address;
	    System.out.println("Enter the Name of the Member");
		m.setName(sc.nextLine());
		System.out.println("Enter the ID of the Member");
		m.setId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the Type of the Member");
		m.setType(sc.nextLine());
		System.out.println("Enter the Phone Number of the Member");
	    m.setPhoneNumber(sc.nextLong());
	    sc.nextLine();
	    System.out.println("Enter the Address of the Member");
	    m.setAddress(sc.nextLine());
	    System.out.println(m.toString());
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
	}

}
