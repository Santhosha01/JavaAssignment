package Inheritance.question2;

import java.util.Scanner;

public class ShapeDemo {
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Base of the Rectangle");
		int base=sc.nextInt();
		System.out.println("Enter the width of the Rectangle");
		int width=sc.nextInt();
		Rectangle r = new Rectangle(base, width);
		r.area();
		r.show();
		System.out.println("Enter the Radius of the Circle");
		int radius=sc.nextInt();
		Circle t = new Circle(radius);
		t.area();
		t.show();
	}

}
