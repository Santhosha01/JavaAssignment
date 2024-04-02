package assignment11.question3;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Question3 {

	public static void main(String[] args) {
	    try { 
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the Phone Number");
            long number=sc.nextLong();
        }
	    catch(InputMismatchException e) {
	    	System.out.println("Input Mismatch");   	
	    }
   }

}
