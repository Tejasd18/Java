class Bar{

	static String wineBrands[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	
	public static boolean addWineBrandName(String wineBrandName){
	boolean isWineBrandAdded=false;
	
	if(wineBrandName!=null){
		wineBrands[index]=wineBrandName;
		index++;
		isWineBrandAdded=true;
	}
	return isWineBrandAdded;
	}

	public static void getWineBrands()
	{
	for(String wineBR : wineBrands) System.out.println(wineBR);
	}

	public static boolean updateWineBrandName(String oldName,String newName){
	boolean isWineBrandUpdated=false;
	
	
	for(int i=0;i<wineBrands.length;i++){
		if(oldName==wineBrands[i]){
			wineBrands[i]=newName;
			isWineBrandUpdated=true;
		}
	}if(isWineBrandUpdated==false) System.out.println("The Wine Brand Names Are Not Updated");
	
	return isWineBrandUpdated;
	}





}