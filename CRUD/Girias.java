class Girias{

	static String homeApplications[]={null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;


	public static boolean createHomeApplication(String homeApplicationName){
	boolean ishomeAppCreated=false;
	
	if(homeApplicationName!=null){
		homeApplications[index]=homeApplicationName;
		index++;
		ishomeAppCreated=true;
	}else{
		System.out.println("The Home Application is Missing ");
	}
	
	return ishomeAppCreated;
	}

	public static void getHomeApplications(){
	
	for(String homeApplicationName:homeApplications)System.out.println(homeApplicationName);
	System.out.println("The Updated Items are :");
	}
	
	public static boolean updateHomeApp(String oldName,String newName){
	boolean isNameUpdated=false;
		
		for(int i=0; i<homeApplications.length;i++){
			if(oldName==homeApplications[i]){
			homeApplications[i]=newName;
			isNameUpdated=true;
			}
		}if(isNameUpdated==false) {
		System.out.println("The Name Is Not Found ");}
		
		
	return isNameUpdated;
	}
	
	
	
	
	
}