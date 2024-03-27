package Inheritance.question2;

public class Rectangle extends Shape{
	int base;
	int width;
	Rectangle(int base, int width) {
		super();
		this.base=base;
		this.width=width;
	}

	void area() {
		a = (base * width);
	}
}
