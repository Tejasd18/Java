class ZeptoRunner{

	public static void main(String fooddd[]){
	
	String foodName = "Unicorn Burger";
	double price = Zepto.takeOrder(foodName);
	System.out.println("The Food Price is "+price);
	
	price=Zepto.takeOrder("Mystic Matcha Latte",4);
	System.out.println(price);
	price=Zepto.takeOrder("Firecracker Tofu Tacos",5);
	System.out.println(price);
	price=Zepto.takeOrder("Fairy Dust Cupcakes",6);
	System.out.println(price);
	price=Zepto.takeOrder("Garlic Prawns",2);
	System.out.println(price);
	
	}

}