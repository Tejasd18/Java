class FiveStarChicken{


		public static double takeOrder(String foodName){
		
		if(foodName == " Fried Chicken"){
			return 450.77;
		}
		if(foodName == "Spicy Fried Chicken"){
			return 455.99;
		}
		if(foodName == "Chicken Popcorn"){
			return 480.90;
		}
		if(foodName == "Hot Wings"){
			return 510.80;
		}
		if(foodName == "Crispy Chicken Burger"){
			return 508.99;
		}
		if(foodName == "Chicken Tenders"){
			return 232.95;
		}
		if(foodName == "BBQ Chicken Wrap"){
			return 308.88;
		}
		if(foodName == "Cheesy Chicken Nuggets"){
			return 408.65;
		}
		if(foodName == "Parmesan Chicken Wings"){
			return 208.14;
		}
		if(foodName == "Sweet Chili Chicken"){
			return 109.96;
		}
		if(foodName == "Honey Mustard Chicken Salad"){
			return 209.45;
		}
		if(foodName == "Chicken Schnitzel"){
			return 309.75;
		}
		if(foodName == "Hyderabadi Biriyani"){
			return 259.76;
		}
		if(foodName == "Korean Fried Chicken"){
			return 383.96;
		}
		if(foodName == "Peri-Peri Chicken Strips"){
			return 403.76;
		}
		else{
		System.out.println(foodName + "Not Found");
		}
		return 0.0;
		
		}

}