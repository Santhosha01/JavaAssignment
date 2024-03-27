package Polymorphism.question1;

public class Rectangle extends Shape{
	int base;
	int width;
	Rectangle(int base, int width) {
		super();
		this.base=base;
		this.width=width;
	}

	void area() {
		area = (base * width);
	}

	@Override
	void perimeter() {
		perimeter=2*(base*width);
		
	}
}
