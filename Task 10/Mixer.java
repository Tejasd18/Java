class Mixer{

	static boolean isConnected;
	static int maxVolume = 4;
	static int minVolume = 2;
	static int currentVolume ;
	
	
	public static void increaseVolume(){
	System.out.println("increaseVolume... started");
	if(isConnected == true){
		if (minVolume < maxVolume){
		minVolume = minVolume+1;
		System.out.println("The Min Volume is "+minVolume);
		}else{
			System.out.println("The Min Volume is reached to max volume");
		}
	if(currentVolume < minVolume){
			currentVolume =	currentVolume+1;
	System.out.println("The Current Volume is "+currentVolume);
	}else{
	System.out.println("The Current Volume is low ");
	}
	}else{
	System.out.println("Please Turn it Off");
	}
	System.out.println("increaseVolume... ended");
	return;
	}
	
	public static void onOrOff(){
	System.out.println("onOrOff.... started");
	
	if(isConnected == false){
		isConnected = true;
		System.out.println("The Mixer is On");
	}else if(isConnected == true){
		isConnected = false;
		System.out.println("The Mixer is Off");
	}
	System.out.println("onOrOff.... ended");
	return ;
	}

}