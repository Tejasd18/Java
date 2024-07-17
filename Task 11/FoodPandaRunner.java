class FoodPandaRunner{

	public static void main(String fooddd[]){
	
	String foodName = "Dragon Roll";
	double price = FoodPanda.takeOrder(foodName);
	System.out.println("The Food Price is "+price);
	
	price = FoodPanda.takeOrder("Dragon Roll",3);
	System.out.println(price);
	price = FoodPanda.takeOrder("Volcano Burger",3);
	System.out.println(price);
	price =  FoodPanda.takeOrder("Truffle Mac'n Cheese",3);
	System.out.println(price);
	price =  FoodPanda.takeOrder("Tandoori Quail",3);
	System.out.println(price);
	
	
	
	
	}

}