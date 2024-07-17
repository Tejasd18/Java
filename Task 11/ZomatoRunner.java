class ZomatoRunner{

	public static void main(String fooddd[]){
	
	String foodName = "Ramen";
	double price = Zomato.takeOrder(foodName);
	System.out.println("The food Price is "+price);
	
	price = Zomato.takeOrder("Butter Chicken",2);
	System.out.println(price);
	price = Zomato.takeOrder("Gourmet Salad",3);
	System.out.println(price);
	price = Zomato.takeOrder("Falafel Wrap",4);
	System.out.println(price);
	price = Zomato.takeOrder("Pasta Carbonara",4);
	System.out.println(price);
	}

}