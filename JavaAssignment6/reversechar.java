package JavaAssignment6;

import java.util.Scanner;

public class reversechar {

	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		System.out.println("Enter the String value");
		String str=inScanner.nextLine();
		StringBuilder sBuilder=new StringBuilder(str);
		System.out.println(sBuilder.reverse());
	}

}
