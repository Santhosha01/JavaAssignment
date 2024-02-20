package JavaAssignment1;

import java.util.Scanner;

public class program4 {
   enum Weekdays{
	   Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday
   }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the weekday you want from 0-6");
		int n=sc.nextInt();
		System.out.println(Weekdays.values()[n]);
	}
}
