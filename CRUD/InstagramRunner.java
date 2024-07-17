class InstagramRunner{



	public static void main(String is[]){
	
	Instagram.createInstaAccount("Alexander","Alez123",9865124537l,"alex123@gmail.com",false);
	
	boolean isInstaAccCreated=true;
	
	if(isInstaAccCreated==true){
	Instagram.fetchInstaDetails();
	}else{
		System.out.println("The Account is not Created");
	}
	}






}