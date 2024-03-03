package inheritanceAndInterface;

class Bag extends Box implements interface3,interface2,interface5,interface4,interface1{
	String color = "red";
	double price = 500;
	char size = 'X';
	String state = "open";

	@Override
	public void open() {
		System.out.println("Bag is opening");
	}

	@Override
	public void close() {
		System.out.println("Bag is " + state + "ing");
	}

	@Override
	public void store() {
		System.out.println("Bag store something");
	}

	@Override
	public void clean() {
		System.out.println("I'm cleaning the bag");
	}

}