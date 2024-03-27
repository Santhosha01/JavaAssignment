package Polymorphism.question1;

import java.util.Scanner;

public class ShapeDemo {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Base of the Rectangle");
		int base=sc.nextInt();
		System.out.println("Enter the width of the Rectangle");
		int width=sc.nextInt();
		Shape s = new Rectangle(base, width);
		s.area();
		s.perimeter();
		s.show();
		System.out.println("Enter the Radius of the Circle");
		int radius=sc.nextInt();
        s= new Circle(radius);
		s.perimeter();
		s.area();
		s.show();
	}

}
