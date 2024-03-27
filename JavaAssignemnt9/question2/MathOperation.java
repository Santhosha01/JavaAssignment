package Polymorphism.question2;


class Calculation {
	  void operation(int a,int b) {
		  System.out.println("Addition Operation = "+(a+b));
	  }
	  void operation(int a,float b) {
		  System.out.println("Subtraction Operation = "+(a-b));
	  }
	  void operation(int a,double b) {
		  System.out.println("Multiply Operation = "+(a*b));
	  }
	  void operation(int a,long b) {
		  System.out.println("Division Operation = "+(a/b));
	  }
}

public class MathOperation {
	
	public static void main(String[] args) {
		Calculation c=new Calculation();
		c.operation(1, 2);
		c.operation(4, 2.2f);
		c.operation(2, 2.5);
		c.operation(8, 4l);
	}

}
