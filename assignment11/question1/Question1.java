package assignment11.question1;

public class Question1 {
  public static void main(String args[]) {
	  try {
		  System.out.println(5/0);
	  }
	  catch(ArithmeticException e) {
		  System.out.println(e.getMessage());
	  }
  }
}
