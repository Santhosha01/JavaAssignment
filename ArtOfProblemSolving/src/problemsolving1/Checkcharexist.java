package problemsolving1;
import java.util.Scanner;

public class Checkcharexist {
	static int index=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String value");
		String str=sc.next();
	    System.out.println("Enter the character you want to check");
		char ch=sc.next().charAt(0);
		System.out.println(allOffByOne(str,ch));
	}
	static boolean allOffByOne(String str,char ch){
		if(index==str.length()) {
			return false;
		}
		if(str.charAt(index)==ch) {
			return true;
		}
		else {
			index++;
		  return allOffByOne(str, ch);
		}
	}

}
