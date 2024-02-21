package JavaAssignment2;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the A value in Quadratic Equation");
		int a=sc.nextInt();
		System.out.println("Enter the B value in Quadratic Equation");
		int b=sc.nextInt();
		System.out.println("Enter the C value in Quadratic Equation");
		int c=sc.nextInt();
		double result1;
		double result2;
		result1=(-b +(Math.sqrt((Math.pow(b, 2))-4*a*c)))/(2*a);
		result2=(-b -(Math.sqrt((Math.pow(b, 2))-4*a*c)))/(2*a);  
		System.out.println(result1);
		System.out.println(result2);
	}

}
