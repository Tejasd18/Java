class SwiggyRunner{


	public static void main(String f[]){
	
	String foodName = "bucket chicken";
	double price = Swiggy.takeOrder(foodName);
	System.out.println(price);
	
	double priceWithQuantity=Swiggy.takeOrder("burger",3);
	System.out.println(priceWithQuantity);
	
	priceWithQuantity=Swiggy.takeOrder("Mushroom biriyani",2);
	System.out.println(priceWithQuantity);
	priceWithQuantity=Swiggy.takeOrder("Cake",5);
	System.out.println(priceWithQuantity);
	}

}