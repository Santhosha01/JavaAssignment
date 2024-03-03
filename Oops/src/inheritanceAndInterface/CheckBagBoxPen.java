package inheritanceAndInterface;

public class CheckBagBoxPen {

	public static void main(String[] args) {
		Bag b = new Bag();
		System.out.println("");
		System.out.println(b.color);
		System.out.println(b.price);
		System.out.println(b.size);
		// System.out.println(b.state);
		b.open();
		b.state = "close";
		b.close();
		b.store();
		b.clean();
		b.thief();// bag is child, box is parent. bag(child) doesn't have thief method. we are inherit parent thief method using inheritance in child object reference.   
		System.out.println("***********************************");
		Box bx=new Box();
		//System.out.println("");
		System.out.println(bx.color);
		System.out.println(bx.price);
		System.out.println(bx.size);
		bx.close();
		bx.state="open";
		bx.open();
		bx.thief();
		bx.store();
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
