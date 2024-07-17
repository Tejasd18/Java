class Swiggy{

	static double price;

	 public static double takeOrder(String foodName){
	 
	 double price = 0.0;
	 if(foodName == "pizza"){
		price =  99.99;
		return price;
	 }
	 if(foodName == "burger"){
		price = 129.00;
		return price;
	 }
	 if(foodName == "French Fries"){
		price = 59.00;
			return price;
	 }
	if(foodName == "biriyani"){
		price= 299;
		return price;
	}
	if(foodName == "kushka"){
		price =  50.00;
		return price;
	}
	if(foodName == "sushi"){
		return 88.00;
	}
	if(foodName == "Tacos"){
		price =  81.10;
		return price;
	}
	if(foodName == "Bonda"){
		price =  15.00;
		return price;
	}
	if(foodName == "ice Cream"){
		price =  20.00;
		return price;
	}
	if(foodName == "bucket chicken"){
		price = 399.99;
		return price;
	}
	if(foodName == "Sandwich"){
		price =  69.00;
		return price;
	}
	if(foodName == "Salad"){
		price =  10.00;
		return price;
	}
	if(foodName == "Cake"){
		price =  59.99;
		return price;
	}
	if(foodName == "Chicken Gravy"){
		price =  289.00;
		return price;
	}
	if(foodName == "Mushroom biriyani"){
		price =  400.00;
		return price;
	}
	else{
	System.out.println(foodName + " Not Found");
	}
	return price;
	
	}
	
	
	public static double takeOrder(String foodName, int quantity){
		
		if(foodName=="burger") {
			price = 129.00 *quantity;
			return price;
		}
		if(foodName == "Mushroom biriyani"){
			price =  400.00*quantity;
			return price;
		}
		if(foodName == "Cake"){
			price =  59.99*quantity;
			return price;
		}
		
	return price;
	}
	
}