class BlinkIt{

		static double price;
		
		public static double takeOrder(String foodName){
		
		if(foodName == "Chicken Wings"){
			price = 401.10;
			return price;
		}
		if(foodName == "Galactic Burger"){
			price = 399.66;
			return price;
		}
		if(foodName == "Mango Salad"){
			price = 410.00;
			return price;
		}
		if(foodName == "Zen Garden Stir Fry "){
			price = 415.55;
			return price;
		}
		if(foodName == "Crispy Tempura Udon"){
			price = 420.00;
			return price;
		}
		if(foodName == "Smoky BBQ Ribs"){
			price = 425.56;
			return price;
		}
		if(foodName == "Heavenly Halibut"){
			price = 430.99;
			return price;
		}
		if(foodName == "Magical Mushroom Risotto "){
			price = 435.77;
			return price;
		}
		if(foodName == "Luscious Lobster Tail "){
			price = 440.00;
			return price;
		}
		if(foodName == "Enchanted Forest Pizza"){
			price = 450.88;
			return price;
		}
		if(foodName == "Divine Dessert Platter"){
			price = 460.81;
			return price;
		}
		if(foodName == "Stardust Smoothie Bowl "){
			price = 476.87;
			return price;
		}
		if(foodName == "Royal Tandoori Platter"){
			price = 459.25;
			return price;
		}
		if(foodName == "Rotti"){
			price = 105.90;
			return price;
		}
		if(foodName == "Pepper Pizza"){
			price = 108.00;
			return price;
		}
		else{
		System.out.println(foodName + "Not Found");
		}
		return price;
		
		}
		
		public static double takeOrder(String foodName,int quantity){
			
		if(foodName == "Rotti"){
			price = 105.90*quantity;
			return price;
		}	
		if(foodName == "Pepper Pizza"){
			price=  108.00*quantity;
			return price;
		}	
		if(foodName == "Royal Tandoori Platter"){
			price = 459.25*quantity;
			return price;
		}	
		return price;
		}
		
		
		

}