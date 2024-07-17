class SbiRunner{


	public static void main(String sr[]){
	
	Sbi.toCreateAccount("Reddy","9874561352","07/07/2000",24,784512365298l,"CXDGH789","babu123@gmail.com","Reddy's wife",
	"Savings");
	
	boolean isAccountCreated=true;
	
	if(isAccountCreated == true){	
	Sbi.getAccDetails();
	}else{
		System.out.println("The Account is not Created ");
	}
	
	}


}