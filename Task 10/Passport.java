class Passport{
	static String cpvLoc;
	static int dcdLoc;
	static String surN;
	static String gN;
	static String db;
	static String em;
	static boolean els;
	static String lId;
	static String pd;
	static String hq;
	static String ha;
	static String cpd;
	static String cp;


	public static boolean createPassport(String cpvLocation, int dcdrLocation, String surName, String givenName, 
	String dob, String email, boolean isEmailLoginSame, String loginId, String pwd, String HintQues, String cPwd, String HintAns, String Captcha){
	
	boolean isPassportCreated = false;
	
			cpvLoc	= cpvLocation;
			dcdLoc = dcdrLocation;
			surN = surName;
			gN = givenName;
			db = dob;
			em = email;
			els = isEmailLoginSame;
			lId	= loginId;
			pd = pwd;
			hq = HintQues;
			ha = HintAns;
			cpd = cPwd;
			cp = Captcha;
	
	
	
	return isPassportCreated;
	}

	public static void getPassportDetails(){
	System.out.println("The cpv location is "+cpvLoc);
	System.out.println("The dcd location is "+dcdLoc);
	System.out.println("sur name is "+surN);
	System.out.println("The given Name is "+gN);
	System.out.println("The date of birth is "+db);
	System.out.println("The email is "+em);
	System.out.println("Is email is Same "+els);
	System.out.println("Logun Id is "+lId);
	System.out.println("The Password is "+pd);
	System.out.println("The Hint Question is "+hq);
	System.out.println("The Hint Answer is "+ha);
	System.out.println("The Conformation password is "+cpd);
	System.out.println("The Captcha is "+cp);
	 
	}
	
	
	



}