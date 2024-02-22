package JavaAssignment3;

import java.util.Scanner;

public class GreatestNumber{   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three values");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int greatestNum=(num1>num2)?((num1>num3)?num1:num3):(num2>num3)?num2:num3;
		System.out.println(greatestNum);
	}

}
