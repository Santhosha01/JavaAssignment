package Polymorphism.question4;

class Car extends Vehicle {
	public Car(String name, String color, double price) {
		super(name, color, price);
		}

	@Override
	void start() {
		System.out.println("Car is Starting");
	}

	@Override
	void stop() {
		System.out.println("Car is Stopped\n");
	}
}
