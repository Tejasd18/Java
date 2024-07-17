class Product {
	
	static String productName = "Wireless Headphones";
	static int price = 199;
	static String category = "Electronics";
	
	public static void main(String[] headPhones) {
    
	boolean isInStock = true;
	float rating = 4.8f;
        
    System.out.println("Product Name: " + productName);
    System.out.println("Price: $" + price);
    System.out.println("Category: " + category);
    System.out.println("Is in Stock: " + isInStock);
	System.out.println("Rating: " + rating + " stars");
    
	}

}