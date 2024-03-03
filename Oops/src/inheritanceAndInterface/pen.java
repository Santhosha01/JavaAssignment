package inheritanceAndInterface;

class Pen implements interface1{
	String color="black";
	double price=15;
	char size='S';
	String state="open";
	@Override
	public void open() {
		System.out.println("pen is "+state+"ing");   
	}
	@Override
	public void close() {
		System.out.println("pen is "+state+"ing");
	}
	@Override
	public void write() {
		System.out.println("Im writing something");
	}
}
