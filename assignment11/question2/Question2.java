package assignment11.question2;


class canNotDivide extends Exception{
	public canNotDivide(String msg) {
		super(msg);
	}
}

public class Question2 {

	public static void main(String[] args) {
	    try { 
          int a=10;
          if(a<10) {
        	  System.out.println("A is less than 10");
          }
          else {
		  throw new canNotDivide("A is greater than 10");
          }
        }
	    catch(canNotDivide e) {
	    	System.out.println(e.getMessage());
	    }
   }

}
