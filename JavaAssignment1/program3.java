package JavaAssignment1;

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the range in which you want Random Number");
	int range=sc.nextInt();
	double d=Math.random()*range;
	int randomNumber=(int)d;
	System.out.println(randomNumber);
	}

}
