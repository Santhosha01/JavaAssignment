package javaassigment10.question2;

import java.util.Scanner;

public class MainDemo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Choose the Music player you want to listen ");
		System.out.println(" 1.MP3 player \n 2.CD player \n 3.Stream Player");
		System.out.println("Enter your Choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
		 System.out.println("You are in MP3Player\n");
		 Playable m=new MP3Player();
		 break;
		case 2:
		 System.out.println("You are in CDPlayer\n");
		 Playable c=new CDPlayer();
		 break;
		case 3:
		 System.out.println("You are in StreamPlayer\n");
		 Playable s=new StreamPlayer();
		 break;
	 }
	}

}
