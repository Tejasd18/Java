class Dominos{


		public static double takeOrder(String foodName){
		
		if(foodName == "Classic Pizza"){
			return 119.88;
		}
		if(foodName == "Pepperoni Pizza "){
			return 121.88;
		}
		if(foodName == "Extravaganzza Pizza"){
			return 123.44;
		}
		if(foodName == "Spinach & Feta Pizza "){
			return 132.56;
		}
		if(foodName == "Fiery Hawaiian Pizza"){
			return 130.43;
		}
		if(foodName == "Mighty Meaty Pizza"){
			return 128.80;
		}
		if(foodName == "Chicken Bacon Ranch Pizza"){
			return 136.79;
		}
		if(foodName == "Veggie Pizza"){
			return 149.11;
		}
		if(foodName == "BBQ Chicken Pizza"){
			return 152.77;
		}
		if(foodName == "Buffalo Chicken Pizza"){
			return 167.88;
		}
		if(foodName == "Italian Sausage Marinara Pasta "){
			return 159.55;
		}
		if(foodName == "Chicken Alfredo Pasta"){
			return 138.58;
		}
		if(foodName == "Chocolate Lava Crunch Cake "){
			return 189.88;
		}
		if(foodName == "Cinnamon Bread Twists "){
			return 179.15;
		}
		if(foodName == "Parmesan Bread Bites"){
			return 173.49;
		}
		else{
		System.out.println(foodName + "Not Found");
		}
		return 0.0;
		
		}

}