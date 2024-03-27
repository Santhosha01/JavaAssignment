package Polymorphism.question4;

public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle v = new Car(" BMW ", "Black",150000);
		v.start();
		v.getVehicleDetails();
		v.stop();
		v = new Bus("School bus", "Black",230000);
		v.start();
		v.getVehicleDetails();
        v.stop();
	}
}
