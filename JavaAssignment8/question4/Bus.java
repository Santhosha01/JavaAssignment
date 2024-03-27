package Inheritance.question4;

public class Bus extends Vehicle {
	public Bus(String name, String color, double price) {
		super(name, color, price);
	}


	@Override
	void start() {
		System.out.println("Bus is Starting");
	}
	
}
