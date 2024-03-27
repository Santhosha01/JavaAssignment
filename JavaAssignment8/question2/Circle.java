package Inheritance.question2;

public class Circle extends Shape {
	int radius;

	Circle(int radius) {
		super();
		this.radius = radius;
	}

	void area() {
		a = 3.14 * (radius * radius);
	}
}
