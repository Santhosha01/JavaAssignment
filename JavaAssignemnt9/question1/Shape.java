package Polymorphism.question1;

public abstract class Shape {
	double area;
	double perimeter;
	public Shape() {
		// TODO Auto-generated constructor stub
	}

	abstract void area();
    abstract void perimeter(); 
   	
	public void show() {
		System.out.println("Area of the Shape is : "+area);
		System.out.println("Perimeter of the Shape is : "+perimeter);
	}
}
