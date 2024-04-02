package javaassignment12.question3;

abstract class Product {
   protected String brandName;
   protected String productType;
   protected double price;
   protected String quality;
	public Product(String brandName, String productType, double price, String quality) {
		super();
		this.brandName = brandName;
		this.productType = productType;
		this.price = price;
		this.quality = quality;
	}

	public abstract void getDescription();
	public abstract void getPrice();

}
