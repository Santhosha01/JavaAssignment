package JavaAssignment6;

import java.util.Scanner;

public class capfirstchar {

	public static void main(String[] args) {
		Scanner inScanner=new Scanner(System.in);
		System.out.println("Enter the string value");
		String str=inScanner.nextLine();
		String str2[]=str.split(" ");
		for (int i = 0; i <str2.length; i++) {
			if(str2[i].length()==1) {
				System.out.print(str2[i]+" ");
			}else {
				System.out.print(str2[i].toUpperCase().substring(0,1)+str2[i].substring(1)+" ");	
			}	
		}
	}

}
