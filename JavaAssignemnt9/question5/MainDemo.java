package Polymorphism.question5;

import java.util.Scanner;

public class MainDemo {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the Movie Name");
		String name = sc.nextLine();
		System.out.println("Enter the Producer Name");
		String producer = sc.nextLine();
		System.out.println("Enter the Duration of the Movie");
		double duration = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the Release Date of the Movie");
		String release = sc.nextLine();
		Movie m = new Movie(name, producer, duration, release);
		m.getDetails();
		System.out.println("\n Movie Details\n");
		System.out.println("Enter the Movie Name");
		String name1 = sc.nextLine();
		System.out.println("Enter the Producer Name");
		String producer1 = sc.nextLine();
		System.out.println("Enter the Duration of the Movie");
		double duration1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the Release Date of the Movie");
		String release1 = sc.nextLine();
		System.out.println("Enter the Genre of the Movie");
		String genre = sc.nextLine();
		Movie m1=new RomCom(name1, producer1, duration1, release1, genre);
//		RomCom m1 = new RomCom(name1, producer1, duration1, release1, genre);
		m1.getDetails();
		System.out.println("\n Movie Details\n");
		System.out.println("Enter the Movie Name");
		String name2 = sc.nextLine();
		System.out.println("Enter the Producer Name");
		String producer2 = sc.nextLine();
		System.out.println("Enter the Duration of the Movie");
		double duration2 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the Release Date of the Movie");
		String release2 = sc.nextLine();
		System.out.println("Enter the Genre of the Movie");
		String genre1 = sc.nextLine();
		Movie m2 = new ThrillerMovie(name2, producer2, duration2, release2, genre1);
		m2.getDetails();
		sc.nextLine();
	}
}
