class FoodPanda{

		static double price;
		
		public static double takeOrder(String foodName){
		
		if(foodName == "Dragon Roll"){
			price = 188.88;
			return price;
		}
		if(foodName == "Volcano Burger"){
			price = 232.32;
			return price;
		}
		if(foodName == "Tandoori Quail "){
			price = 400.00;
			return price;
		}
		if(foodName == "Truffle Mac'n Cheese"){
			price = 450.00;
			return price;
		}
		
		else{
		System.out.println(foodName + "Not Found");
		}
		return price;
		
		}
		
		public static double takeOrder(String foodName,int quantity){
			
		if(foodName == "Dragon Roll"){
			price = 105.90*quantity;
			return price;
		}	
		if(foodName == "Volcano Burger"){
			price=  108.00*quantity;
			return price;
		}	
		if(foodName == "Truffle Mac'n Cheese"){
			price = 459.25*quantity;
			return price;
		}
		if(foodName=="Tandoori Quail "){
			price = 400.00*quantity;
			return price;
		}
		return price;
		}
		
		

}