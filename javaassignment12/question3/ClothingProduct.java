package javaassignment12.question3;

public class ClothingProduct extends Product{
	String size;
	

	public ClothingProduct(String brandName, String productType, double price, String quality, String size) {
		super(brandName, productType, price, quality);
		this.size = size;
	}

	@Override
	public void getDescription() {
		System.out.println("Cloth Product Detail :  \n\n Brand Name = " + brandName + "\n Product Type = " + productType+
				"\n Quality = " + quality+"\n Usage of the Product = "+this.size);
	}

	@Override
	public void getPrice() {
		
		System.out.println(" Produt Price = "+price);
	}
    
}
