class GoldShop{

	static String goldItems[]={null,null,null,null,null,null,null};
	static int index;

	public static boolean addGoldItem(String goldItem){
	boolean isGoldItemAdded=false;
	
	if(goldItem!=null){
		goldItems[index]=goldItem;
		index++;
		isGoldItemAdded=true;
	}
	return isGoldItemAdded;
	}

	public static void getGoldItems(){
	
	for(String gI:goldItems){
		System.out.println(gI);
	}
	}

	public static boolean UpdateGoldItem(String oldItem,String newItem){
	boolean isGoldItemUpdated=false;
	
	for(int i=0;i<goldItems.length;i++){
		if(oldItem==goldItems[i]){
			goldItems[i]=newItem;
			isGoldItemUpdated=true;
		}
	}if(isGoldItemUpdated==false) System.out.println("The Gold Items Are not Updated ");
	
	
	
	
	return isGoldItemUpdated;
	}




}