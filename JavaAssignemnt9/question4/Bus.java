package Polymorphism.question4;

public class Bus extends Vehicle {
	public Bus(String name, String color, double price) {
		super(name, color, price);
	}


	@Override
	void start() {
		System.out.println("Bus is Starting");
	}


	@Override
	void stop() {
		System.out.println("Bus is Stopped");
	}
	
}
