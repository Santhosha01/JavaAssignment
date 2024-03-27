package Polymorphism.question1;

public class Circle extends Shape {
	int radius;
    static double pi=3.14;
	Circle(int radius) {
		super();
		this.radius = radius;
	}

	void area() {
		area = pi * (radius * radius);
	}

	@Override
	void perimeter() {
		perimeter=2*pi*radius;
	}
}
