class Zomato{
	
		static double price;
		
		public static double takeOrder(String foodName){
		
		if(foodName == "Pizza Margherita"){
			price = 119.11;
			return price;
		}
		if(foodName == "Mushroom Tikka"){
			price = 33.33;
			return price;
		}
		if(foodName == "Chicken Tikka Masala"){
			price = 266.00;
			return price;
		}
		if(foodName == "Pho Ga "){
			price =	22.22;
			return price;
		}
		if(foodName == "Cheeseburger "){
			price = 50.00;
			return price;
		}
		if(foodName == "Pad Thai"){
			price = 9.00;
			return price;
		}
		if(foodName == "Tacos"){
			price = 58.00;
			return price;
		}
		if(foodName == "Paneer Butter Masala"){
			price =	47.00;
			return price;
		}
		if(foodName == "Pasta Carbonara"){
			price = 23.99;
			return price;
		}
		if(foodName == "Maki Rolls "){
			price =	36.80;
			return price;
		}
		if(foodName == "Ramen"){
			price = 88.99;
			return price;
		}
		if(foodName == "Falafel Wrap"){
			price = 39.60;
			return price;
		}
		if(foodName == "Hamburger Steak"){
			price = 99.50;
			return price;
		}
		if(foodName == "Butter Chicken"){
			price = 220.00;
			return price;
		}
		if(foodName == "Gourmet Salad"){
			price=  110.00;
			return price;
		}
		else{
		System.out.println(foodName + "Not Found");
		}
		return price;
		
		}
		
		public static double takeOrder(String foodName,int quantity){
			
		if(foodName == "Butter Chicken"){
			price = 220.00*quantity;
			return price;
		}	
		if(foodName == "Gourmet Salad"){
			price=  110.00*quantity;
			return price;
		}	
		if(foodName == "Falafel Wrap"){
			price = 39.60*quantity;
			return price;
		}	
		if(foodName == "Pasta Carbonara"){
			price = 23.99*quantity;
			return price;
		}
			return price;
		}

}