class Television{
	
	static boolean isConnected;
	static int minVolume;
	static int maxVolume = 7;
	static int currentVolume ;
	
	public static void increaseVolume(){
	System.out.println("increase Volume started");
	if(isConnected == true){
	if(currentVolume < maxVolume ){
			currentVolume = currentVolume+1;
	System.out.println("The Current Volume of TV is "+currentVolume);
	}else{
	System.out.println("it is in normal volume");
	}
	}else{
	System.out.println("Please Turn it Off");
	}
	System.out.println("increase Volume ended");
	return ; 
	}
	
	public static void onOrOff(){
	
	System.out.println("onOrOff- started");
	
	if(isConnected == false){
		isConnected = true;
		System.out.println("The TV is On");
	}else if(isConnected == true){
		isConnected = false;
		System.out.println("The TV is Off");	
	}
	System.out.println("onOrOff- ended");
	return ;
	}


}