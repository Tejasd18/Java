class Amazon{

	static String n;
	static String s;
	static long p;
	static String e;
	static boolean a;


	public static boolean toCreateAccount(String name,String surName,long phoneNo,String email,
	boolean allowOtherUsers){
	
	boolean isAccountCreated=false;
	
	 n = name;
	 s= surName;
	 p = phoneNo ;
	 e = email ;
     a= allowOtherUsers;
	
	
	
	return isAccountCreated;
	}


	public static void getAmazonDetails(){
		
	System.out.println("Name : "+n);
	System.out.println("surName : "+s);
	System.out.println("Mobile Number : "+p);
	System.out.println("Email Id : "+e);
	System.out.println("Allow Other Users : " +a);
	System.out.println("End Statements.....");
	}





}