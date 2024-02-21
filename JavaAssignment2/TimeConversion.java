package JavaAssignment2;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value in seconds you want to convert into time format");
		int a=sc.nextInt();
		int hour=a/3600;
		int rem=a%3600;
		int minutes=rem/60;
		int seconds=rem%60;
		System.out.println(hour+":"+minutes+":"+seconds);
	}

}
