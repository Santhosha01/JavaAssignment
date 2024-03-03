package inheritanceAndInterface;

public class checkBag {
	public static void main(String[] args) {
		Bag b=new Bag();
		System.out.println("");
		System.out.println(b.color);
		System.out.println(b.price);
		System.out.println(b.size);
		//System.out.println(b.state);
		b.open();
		b.state="close";
		b.close();
		b.store();
		b.clean();
		System.out.println("***********************************");

	}

}
