class AirConditionerRunner{



	public static void main(String ac[]){
	System.out.println("Main Started");
	//invoking a method 
	AirConditioner.getFeatures();
	
	AirConditioner.onOrOff();
	AirConditioner.onOrOff();
	
	
	AirConditioner.increaseTemp();
	AirConditioner.decreaseTemp();
	
	System.out.println("Main Ended");
	

	
	
	} 




}