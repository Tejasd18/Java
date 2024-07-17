class Microwave{

	static boolean isConnected = true;
	static int currentVolume = 1 ;
	static int minVolume ;
	static int maxVolume = 6;


	public static void increaseVolume(){
	
	System.out.println("Increase Volume Started");
	if(isConnected == true){
	if (minVolume < currentVolume){
		System.out.println("This is not the End ");
	}else{
		System.out.println("This is the End");
	}
	if(currentVolume < maxVolume){
		currentVolume = currentVolume+1;
		System.out.println("The Current Volume is "+ currentVolume);
	}else{
	System.out.println("Maximum Volume is Reached");
	}
	}else{
	System.out.println("Please Turn it Off");
	}
	System.out.println("Increase Volume Ended");
	return ;
	}

	public static void onOrOff(){
	
	System.out.println("onOrOff() started");
	
	isConnected=(!isConnected) ? true : false;
	System.out.println("Microwave is Turned Off ");
	
	/*if(isConnected == true){
		isConnected = false;
		
	}else if(isConnected == false){
		isConnected = true;
		System.out.println("Microwave is Turned On");
	}*/
	
	System.out.println("onOrOff() Ended");
	
	return ;
	}


}