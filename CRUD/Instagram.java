class Instagram{

	static String ue;
	static String pd;
	static long pN;
	static String em;
	static boolean as;

	public static boolean createInstaAccount(String userName, String password,
		long phoneN, String email,boolean allowContacts){
		
	boolean isInstaAccCreated=false;
	boolean isUserNameValid=false;
	boolean isPasswordValid=false;
	boolean isphoneNoValid=false;
	boolean isEmailValid=false;
	boolean isAllowContactsValid=false;
	
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
	if(allowContacts!=false){
		as=allowContacts;
		isAllowContactsValid=true;
	}else{
		System.out.println("Please response to it ");
	}
	
	if(isUserNameValid && isPasswordValid && isphoneNoValid && isEmailValid && isAllowContactsValid){
		isInstaAccCreated=true;
	}
		
		
		
		
	return isInstaAccCreated;
	}

	public static void fetchInstaDetails(){
	System.out.println("The UserName is : "+ue);
	System.out.println("Password Set is : "+pd);
	System.out.println("Phone Number : "+pN);
	System.out.println("Email ID : "+em);
	System.out.println("Will You Allow Contacts : "+as);
	
	
	
	
	
	
	}





}