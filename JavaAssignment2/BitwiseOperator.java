package JavaAssignment2;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Two values");  //values=5,7
		int a=sc.nextInt();
		int b=sc.nextInt();

		// bitwise and
		// 0101 & 0111=0101 = 5
		System.out.println("a&b = "+(a & b));

		// bitwise or
		// 0101 | 0111=0111 = 7
		System.out.println("a|b = " + (a | b));

		// bitwise xor
		// 0101 ^ 0111=0010 = 2
		System.out.println("a^b = " + (a ^ b));

		// bitwise not
		// will give 2's complement (32 bit) of 5 = -6
		System.out.println("~a = " + ~a);

		System.out.println("Bitwise Left Shift of a : " + (a << 2));
		System.out.println("Bitwise Right Shift of a : " + (a >> 2));
		System.out.println("Bitwise Unsigned Right Shift of a : " + (a >>> 2));
	}

}
