class Gym{

	static String gymEquipments[]={null,null,null,null,null,null,null,null};
	static int priceValues[]={0,0,0,0,0,0,0,0};
	static int index;
	static int inde;
	
	public static boolean createGymEquipment(String gymEquipmentName){
	boolean isGymEquipmentAdded=false;
	
	if(gymEquipmentName!=null){
			gymEquipments[index]=gymEquipmentName;
			index++;
			isGymEquipmentAdded=true;
	}else{
		System.out.println("The Gym Equipment is not found ");
	}
	
	
	return isGymEquipmentAdded;
	}
	
	public static void getGymEquipments(){
	System.out.println("getGymEquipments started");
	
	for(String gymEquipmentName:gymEquipments){ 
		System.out.println(gymEquipmentName);
	}
	for(int priceVl:priceValues){
		System.out.println(priceVl);
	}
	
	System.out.println("getGymEquipments ended");
	return;
	}

	public static boolean addPriceValue(int priceValue){
		
	boolean isPriceAdded=false;
		if(priceValue>0){
			priceValues[inde]=priceValue;
			inde++;
			isPriceAdded=true;
		}
		
	return isPriceAdded;
	
	}

	public static boolean updateGymNames(String oldName, String newName){
		boolean isNameUpdated=false;
		
		for(int i=0;i<gymEquipments.length;i++){
			if(oldName==gymEquipments[i]){
				gymEquipments[i]=newName;
				isNameUpdated=true;
			}	
		}
		
		
		return isNameUpdated;
	}



}