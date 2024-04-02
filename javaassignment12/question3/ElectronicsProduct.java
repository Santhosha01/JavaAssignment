package javaassignment12.question3;

public class ElectronicsProduct extends Product{
    String usage;
	public ElectronicsProduct(String brandName, String productType, double price, String quality,String usage) {
		super(brandName, productType, price, quality);
		this.usage=usage;
	}

	@Override
	public void getDescription() {
		System.out.println("Electronics Product Detail :  \n\n Brand Name = " + brandName + "\n Product Type = " + productType+
				"\n Quality = " + quality+"\n Usage of the Product = "+usage );
	}

	@Override
	public void getPrice() {
		System.out.println(" Produt Price = "+price);
	}
    
}
