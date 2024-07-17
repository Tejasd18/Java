class Speaker{
	
	static boolean isConnected = true;
	static int currentVolume ;
	static int minVolume = 15;
	static int maxVolume = 50;
	
	public static void increaseVolume(){
	
	System.out.println("increase Volume started");
	if(isConnected == true){
	if(currentVolume <	maxVolume){
			currentVolume	= currentVolume+10;
	System.out.println("The current Volume is "+currentVolume);
	}else{
		System.out.println("The current Volume is High ");
	}
	}else{
	System.out.println("Please Turn it Off");
	}
	System.out.println("increase Volume ended");
	return ;
	}



	public static void onOrOff(){
	System.out.println("On or Off Started");
	if(isConnected == true){
	isConnected = false;
	System.out.println("Speaker is Turned Off");
	}else if(isConnected == false){
	isConnected = true;
	System.out.println("Speaker is Turned On");
	}
	System.out.println("On or Off Ended");
	return ; 
	}














}