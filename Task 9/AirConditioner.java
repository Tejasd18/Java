class AirConditioner{

	static boolean isConnected = true;
	static int minTemperature ;
	static int maxTemperature = 5 ;
	static int currentTemperature = 4;


	public static void decreaseTemp(){
		System.out.println("Decrease Temp Started");
		if(isConnected == true){
		if (currentTemperature > maxTemperature){
						currentTemperature	= 	currentTemperature-1;
			System.out.println(currentTemperature);
		}else{
			System.out.println("Temperature is Decreased");
		}
		}else{
			System.out.println("Turnn it Off ");
		}
		
		System.out.println("Decrease Temp Ended");	
		return ; 
	}




	public static void increaseTemp(){
		System.out.println("Increase Temp Started");
	if (isConnected == true){
		if(currentTemperature <= maxTemperature){
				currentTemperature		=	currentTemperature+1;
			System.out.println(currentTemperature);
		}
		else{
			System.out.println("Max Temperature is Reached");
		}
	}else{
		System.out.println("Turn it off ");
	}
		return ;
		System.out.println("Increase Temp Ended");
	}

	public static void onOrOff(){
		
		System.out.println("onOrOff started");
		
		if(isConnected == true){
			isConnected = false;
			System.out.println("Air Conditioner is Off");
			
		}else if(isConnected == false){
			isConnected = true;
			System.out.println("Air Conditioner is On");
		}
		
		System.out.println("onOrOff ended");
		return;
	}

// Method Declaration
	public static void getFeatures(){
	// local variable
	System.out.println("get Features Started");
	
	String name = "Whirlphool";
	int price  = 7899;
	
	System.out.println("The Name of AC is "+name);
	System.out.println("The Price of AC is "+price);
	
	
	System.out.println("get Features Ended");
	return ;
	
	}

}