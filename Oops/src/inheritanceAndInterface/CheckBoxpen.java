package inheritanceAndInterface;

public class CheckBoxpen {
	public static void main(String[] args) {

		Box bx = new Box();
		System.out.println(bx.color);
		System.out.println(bx.price);
		System.out.println(bx.size);
		bx.close();
		bx.state = "open";
		bx.open();
		bx.thief();
		bx.store();
		bx.write();// box is child, pen is parent. box(child) doesn't have thief method. we are inherit parent thief method using inheritance in child object reference.
		System.out.println("****************************");
		Pen pen=new Pen();
		System.out.println(pen.color);
		System.out.println(pen.price);
		System.out.println(pen.size);		
		pen.close();
		pen.open();
		pen.write();

	}

}
