package JavaAssignment6;

import java.util.Scanner;

public class Vowelcount {

	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=inScanner.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				count++;
			}
		}
		System.out.println(count);
	}

}
