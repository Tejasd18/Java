class Hospital{

	static String fName;
	static long mNo;
	static String add;
	static String tNo;
	static String med;
	static String pt;
	static int wNo;
	static int ps;
	static int a;
	static String d;
	
	public	static	boolean	registerPatient(String fullName,long mobileNo,String address,String tokenNo,
	String medicines,String problemOfPatient,int wardNo,int priceOfMedicines,int age,String date){
	
	boolean isPatientRegistered=false;
	
	if(fullName!=null && mobileNo!=0 && address!=null && tokenNo!=null && medicines!=null && 
	problemOfPatient!=null && wardNo!=0 && priceOfMedicines!=0 && age!=0 && date!=null){
	
	fName=fullName;
	mNo=mobileNo;
	add=address;
	tNo=tokenNo;
	med=medicines;
	pt=problemOfPatient;
	wNo=wardNo;
	ps=priceOfMedicines;
	a=age;
	d=date;
	isPatientRegistered=true;
	}
	return isPatientRegistered;
	}

	public static void getPatientDetails()
	{
	
	System.out.println("Full Name is "+fName);
	System.out.println("Mobile Number "+mNo);
	System.out.println("Address "+add);
	System.out.println("Token Number "+tNo);
	System.out.println("Medicines "+med);
	System.out.println("Problem Of Patient "+pt);
	System.out.println("Ward Number "+wNo);
	System.out.println("Price Of the Medicines "+ps);
	System.out.println("Age "+a);
	System.out.println("Date "+d);
	
	
	}




}