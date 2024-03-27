package Inheritance.question4;

class Car extends Vehicle {
	public Car(String name, String color, double price) {
		super(name, color, price);
		}

	@Override
	void start() {
		System.out.println("Car is Starting");
	}
}
