class MyntraRunner{



	public static void main(String my[]){
	
	Myntra.createAccount("John","John454",9865124558l,"john76@gmail.com","Birmigham");
	
	boolean isAccCreated=true;
	
	if(isAccCreated==true){
	Myntra.getMyntraAccDetails();
	}else{
		System.out.println("The Account is not Created");
	}
	}






}