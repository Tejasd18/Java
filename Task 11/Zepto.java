class Zepto{

	static double price;
	
		public static double takeOrder(String foodName){
		
		if(foodName == "Unicorn Burger"){
			price = 300.00;
			return price;
		}
		if(foodName == "Rainbow Sushi Roll"){
			price = 310.00;
			return price;
		}
		if(foodName == "Crispy Duck Pancakes "){
			price =  290.00;
			return price;
		}
		if(foodName == "Galaxy Pizza"){
			price = 320.99;
			return price;
		}
		if(foodName == "Mermaid Bowl"){
			price = 280.00;
			return price;
		}
		if(foodName == "Magic Mushroom Risotto"){
			price = 340.00;
			return price;
		}
		if(foodName == "Dragon Breath Wings"){
			price = 270.00;
			return price;
		}
		if(foodName == "Golden Tempura Udon"){
			price = 350.00;
			return price;
		}
		if(foodName == "Satay Lollipops "){
			price =	260.99;
			return price;
		}
		if(foodName == "Garlic Prawns"){
			price = 360.99;
			return price;
		}
		if(foodName == "Honey Sriracha Chicken"){
			price = 271.11;
			return price;
		}
		if(foodName == "Feast Platter "){
			price = 371.12;
			return price;
		}
		if(foodName == "Fairy Dust Cupcakes"){
			price = 281.11;
			return price;
		}
		if(foodName == "Firecracker Tofu Tacos "){
			price = 380.89;
			return price;
		}
		if(foodName == "Mystic Matcha Latte"){
			price = 390.19;
			return price;
		}
		else{
		System.out.println(foodName + "Not Found");
		}
		return price;
		
		}
		
		
		public static double takeOrder(String foodName,int quantity){
			
			if(foodName == "Mystic Matcha Latte"){
				price = 380.89*quantity;
				return price;
			}
			if(foodName == "Firecracker Tofu Tacos "){
				price = 380.89*quantity;
				return price;
			}
			if(foodName == "Fairy Dust Cupcakes"){
				price = 281.11*quantity;
				return price;
			}
			if(foodName == "Garlic Prawns"){
				price = 360.99*quantity;
				return price;
			}
			return price;
		}

}