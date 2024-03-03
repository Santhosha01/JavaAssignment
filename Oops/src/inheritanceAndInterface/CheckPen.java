package inheritanceAndInterface;

public class CheckPen {

	public static void main(String[] args) {
		Pen p=new Pen();
		System.out.println(p.color);
		System.out.println(p.price);
		System.out.println(p.size);
		p.close();
		p.state="close";
		p.open();
		p.write();
		System.out.print("****************************");
	}

}
