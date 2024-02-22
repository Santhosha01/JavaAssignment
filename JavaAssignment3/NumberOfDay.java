package JavaAssignment3;

import java.util.Scanner;

public class NumberOfDay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Month(Example - January)");
		String month=sc.nextLine();
		System.out.println("Enter the year");
		int year=sc.nextInt();
		switch (month) {
		case "January","March","May","July","August","October","December": {
			System.out.println("Number of days in the "+month+" is 31 Days");
			break;
		}
		case "April","June","September","November": {
			System.out.println("Number of days in the "+month+" "+year+" is 30 Days");
			break;
		}
		case "February": {
			if(LeapOrNot(year)) {
				System.out.println("Number of days in the "+month+" "+year+" is 29 Days");
			}
			else {
				System.out.println("Number of days in the "+month+" "+year+" is 28 Days");
			}
			break;
		}
		default:
			System.out.println("Invalid input");
		}
	}
	public static boolean LeapOrNot(int year) {
		if((year%4==0&&year%100!=0)||(year%400==0)) {
			return true;
		}
		return false;
	}
}
