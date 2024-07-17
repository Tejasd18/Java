class BlinkItRunner{

	public static void main(String fooddd[]){
	
	
	String foodName = "Chicken Wings";
	double price = BlinkIt.takeOrder(foodName);
	System.out.println("The Food Price is "+price);
	
	
	price =  BlinkIt.takeOrder("Rotti",2);
	System.out.println(price);
	price = BlinkIt.takeOrder("Pepper Pizza",3);
	System.out.println(price);
	price =  BlinkIt.takeOrder("Royal Tandoori Platter",4);
	System.out.println(price);
	
	
	
	}

}