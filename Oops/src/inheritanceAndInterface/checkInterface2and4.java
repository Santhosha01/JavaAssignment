package inheritanceAndInterface;

public class checkInterface2and4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface2 inter2 = new Box();
		inter2.open();
		inter2.store();
		inter2.thief();
		System.out.println("**************************");
		interface4 inter4 = new Box();
		inter4.close();
		inter4.thief();
		inter4.write();
		System.out.println("**************************");
	}

}
