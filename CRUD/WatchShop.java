class WatchShop{

	static String watchBrandNames[]={null,null,null,null,null,null,null,null,null,null};
	static int index;

	public static boolean addWatchBrandName(String watchBrandName){
	boolean isWatchBrandNameAdded=false;
	if(index<watchBrandNames.length){
	if(watchBrandName!=null){
		watchBrandNames[index]=watchBrandName;
		index++;
		isWatchBrandNameAdded=true;
	}
	}
	return isWatchBrandNameAdded;
	}
	
	public static void getWatchBrandNames(){
	
	for(String watchBrandNm:watchBrandNames) System.out.println(watchBrandNm);
	
	}
	
	public static boolean updateWatchBrandName(String oldName,String newName){
	
	boolean isWatchBrandNameUpdated=false;
	
	for(int i=0;i<watchBrandNames.length;i++){
		if(oldName==watchBrandNames[i]){
			watchBrandNames[i]=newName;
			isWatchBrandNameUpdated=true;
		}
	
	}if(isWatchBrandNameUpdated==false) System.out.println("The Watch Brand Name is Not Updated");
	
	
	
	
	return isWatchBrandNameUpdated;
	}



}