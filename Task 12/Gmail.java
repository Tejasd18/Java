class Gmail{

	static String fN;
	static String sN;
	static String db;
	static String gr;
	static boolean iTGa;
	static String pd;
	static String cd;

	public static boolean createGoogleAccount(String firstName,String surName,String dob,String gender,
	boolean isToCreateOwnGa,String psd,String cpsd){
	
	boolean isGoogleAccValid=false;
	
	fN = firstName;
	sN = surName;
	db = dob;
	gr = gender;
	iTGa = isToCreateOwnGa;
	pd = psd;
	cd = cpsd;
	
	
	return isGoogleAccValid;
	}


	public static void fetchGmailAcc(){
		
	System.out.println("The First Name is "+fN);
	System.out.println("SurName is "+sN);
	System.out.println("Date of Birth "+db);
	System.out.println("Gender "+gr);
	System.out.println("Is to Create Own Gmail Add - " +iTGa);
	System.out.println("password "+pd);
	System.out.println("Confirm Password "+cd);
	}





}