package JavaAssignment6;

import java.util.Scanner;

public class Workreverse {

	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		System.out.println("Enter the string value");
		String str=inScanner.nextLine();
		String str2[]=str.split(" ");
		for (int i = str2.length-1; i >=0; i--) {
			System.out.print(str2[i]+" ");	
		}


	}

}
