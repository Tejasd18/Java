class Shoes{

	static String shoeBrands[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addShoeBrand(String shoeBrandName){
	boolean isShoeBrandNameAdded=false;
	
	if(shoeBrandName!=null){
		shoeBrands[index]=shoeBrandName;
		index++;
		isShoeBrandNameAdded=true;
	}
	return isShoeBrandNameAdded;
	}

	public static void getShoeBrands(){
	
	for(String shoeNames:shoeBrands) System.out.println(shoeNames);
	
	}

	public static boolean updateShoeBrandName(String oldName,String newName){
	boolean isShoeBrandNameUpdated=false;
	
	for(int i=0;i<shoeBrands.length;i++){
		if(oldName==shoeBrands[i]){
			shoeBrands[i]=newName;
			isShoeBrandNameUpdated=true;
		}
	}
	
	
	return isShoeBrandNameUpdated;
	}




}