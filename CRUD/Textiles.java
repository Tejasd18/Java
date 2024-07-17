class Textiles{

	static String materials[]={null,null,null,null,null,null,null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addMaterial(String materialName){
	boolean isMaterialsAdded=false;
	
	if(materialName!=null){
		materials[index]=materialName;
		index++;
		isMaterialsAdded=true;
	}
	return isMaterialsAdded;
	}

	public static void getAllMaterials(){
	
	for(String allMaterials:materials) System.out.println(allMaterials);
	}

	public static boolean updateMaterialName(String oldName,String newName){
	boolean isMaterialUpdated=false;
	
	for(int i=0;i<materials.length;i++){
		if(oldName==materials[i]){
			materials[i]=newName;
			isMaterialUpdated=true;
		}
	}
	
	
	return isMaterialUpdated;
	}






}