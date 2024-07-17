class Myntra{

	static String ue;
	static String pd;
	static long pN;
	static String em;
	static String add;

	public static boolean createAccount(String userName, String password,
		long phoneN, String email,String address){
		
	boolean isAccCreated=false;
	boolean isUserNameValid=false;
	boolean isPasswordValid=false;
	boolean isphoneNoValid=false;
	boolean isEmailValid=false;
	boolean isAddressValid=false;
	
	if(userName!=null){
		ue = userName;
		isUserNameValid=true;
	}else{
		System.out.println("Please provide a valid Name ");
	}
	if(password!=null){
		pd= password;
		isPasswordValid=true;
	}else{
		System.out.println("Please provide a valid Password ");
	}
	if(phoneN!=0){
		pN=phoneN;
		isphoneNoValid=true;
	}else{
		System.out.println("Please provide a valid Phone Number ");
	}
	if(email!=null){
		em = email;
		isEmailValid=true;
	}else{
		System.out.println("Please provide a valid Email ");
	}
	if(address!=null){
		add = address;
		isAddressValid=true;
	}else{
		System.out.println("Please provide your address ");
	}
	
	if(isUserNameValid && isPasswordValid && isphoneNoValid && isEmailValid && isAddressValid){
		isAccCreated=true;
	}
	
		
	return isAccCreated;
	}

	public static void getMyntraAccDetails(){
	System.out.println("The UserName is : "+ue);
	System.out.println("Password Set is : "+pd);
	System.out.println("Phone Number : "+pN);
	System.out.println("Email ID : "+em);
	System.out.println("Address : "+add	);
	}

}