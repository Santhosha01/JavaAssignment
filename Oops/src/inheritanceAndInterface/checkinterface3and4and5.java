package inheritanceAndInterface;

public class checkinterface3and4and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface1 inter1=new Bag();
		inter1.open();
		inter1.close();
		inter1.write();
		System.out.println("*************************");
		interface2 inter2 = new Bag();
		inter2.open();
		inter2.store();
		inter2.thief();
		System.out.println("**************************");
		interface3 inter3=new Bag();
		inter3.open();
		inter3.store();
		inter3.clean();
		System.out.println("*************************");
		interface4 inter4=new Bag();
		inter4.close();
		inter4.thief();
		inter4.write();
		System.out.println("*************************");
		interface5 inter5=new Bag();
		inter5.close();
		inter5.clean();
		inter5.open();
		inter5.store();
		inter5.thief();
	}

}
