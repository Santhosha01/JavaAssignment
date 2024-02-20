package JavaAssignment1;

import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Two Number you want to Swap");
	   int num1=sc.nextInt();
	   int num2=sc.nextInt();
	   System.out.println("Two numbers before swap = "+num1+" "+num2);
	   int temp=0;
	   temp=num1;
	   num1=num2;
	   num2=temp;
	   System.out.println("Two Number swap with another variable = "+num1+" "+num2);
	   num1=num1+num2;
	   num2=num1-num2;
	   num1=num1-num2;
	   System.out.println("Two Number swap without another variable = "+num1+" "+num2);
	}

}
