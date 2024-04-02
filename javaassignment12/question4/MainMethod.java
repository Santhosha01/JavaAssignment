package javaassignment12.question4;

public class MainMethod {

	public static void main(String[] args) {
		Movie a=new ActionMovie("Leo", "Lyca", 2.30, "12/04/2023", "Action");
		a.getDetails();
		System.out.println();
		Movie r=new RomMovie("Permalu", "Red Gaints", 2.45, "12/01/2024", "Rom-com");
		r.getDetails();
	}

}
