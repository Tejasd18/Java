class TeaShop{

	static String shopName = "Sri Venkatesaya Tea Shop";
	static String ownerName = "Tej";
	
	static String teaNames[]={null,null,null,null,null};
	static double teaPrices[] = {0.0,0.0,0.0,0.0,0.0};
	static int index1 ;
	static int index2;

	public static boolean addTeaName(String teaName){
	boolean isTeaAdded = false;
	
	if(index1<teaNames.length ){
		if(teaNames != null){
			teaNames[index1]	=	teaName;
			index1++;
			isTeaAdded=true;
		}else System.out.println("The Tea Name is Null, which is not Found");
	}else{
		System.out.println("Jaga Illa");
	}
	return isTeaAdded;
	}
	
	public static void getAddedTeaNames(){
	System.out.println("The Available items are:");
	
	for(int i=0;i<teaNames.length;i++){
		System.out.println(teaNames[i]);
		System.out.println(teaPrices[i]);
	}
	return;
	
	}
	
	public static boolean addTeaPrice(double teaPrice){
		boolean isTeaPriceAdded=false;
		
		if(teaPrice>0.0){
			teaPrices[index2]=teaPrice;
			index2++;
			isTeaPriceAdded=true;
		}
		
		
		return isTeaPriceAdded;
	}

	public static boolean updateTeaName(String oldName,String newName){
		boolean isTeaNameUpdated=false;
		
		for(int in=0; in<teaNames.length;in++){
			if(oldName==teaNames[in] ){
				teaNames[in]=newName;
			isTeaNameUpdated=true;
			}	
		}if(isTeaNameUpdated==false){
			System.out.println("The Tea Name is not Found");
		}
		
		
		
		return isTeaNameUpdated;
	}
	


}