package JavaAssignment3;

import java.util.Scanner;

public class FactorialSeries {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		int fac=1;
		while(temp>0) {
			fac*=temp;
			temp--;
		}
		System.out.println("Factorial of "+num+" = "+fac );
	}

}
