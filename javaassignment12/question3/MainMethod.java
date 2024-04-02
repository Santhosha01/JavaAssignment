package javaassignment12.question3;

public class MainMethod {

	public static void main(String[] args) {
		ElectronicsProduct e=new ElectronicsProduct("Oppo A2", "Smart Phone", 25999, "Best", "call and text");
		e.getDescription();
		e.getPrice();
		System.out.println();
		ClothingProduct c=new ClothingProduct("Adidas", "pant", 6000, "Best","M");
		c.getDescription();
	    c.getPrice();
	}

}
