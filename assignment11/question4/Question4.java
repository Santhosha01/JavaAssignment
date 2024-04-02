package assignment11.question4;

import java.util.Scanner;

class bankException extends Exception{
	public bankException(String msg) {
		super(msg);
	}
}

public class Question4 {

	public static void main(String[] args) {
	    try { 
	      Scanner sc=new Scanner(System.in);
	      int totalBalance=1500;
	      System.out.println("Enter the amount you want to Withdraw ");
          int withdraw=sc.nextInt();
          
          if(withdraw<=totalBalance) {
        	  System.out.println(withdraw +" Amount Withdraw Successfully");
          }
          else {
		  throw new bankException("Insufficient Balance");
          }
        }
	    catch(bankException e) {
	    	System.out.println(e.getMessage());
	    }
   }

}
