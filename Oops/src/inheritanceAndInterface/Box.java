package inheritanceAndInterface;


public class Box extends Pen implements interface2,interface4{
	String color="blue";
	double price=100;
	char size='M';
	String state="close";
	@Override
	public void open() {
		System.out.println("box is "+state+"ing");   
	}
	@Override
	public void close() {
		System.out.println("box is "+state+"ing");
	}
	@Override
	public void store() {
		System.out.println("Box store something");
	}
	@Override
	public void thief() {
		System.out.println("My box is stolen");
	}
}