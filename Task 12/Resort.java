class Resort{

	static String ne;
	static long ado;
	static long po;
	static String dn;
	static String ad;
	static boolean co;


	public static boolean toApplyResort(String name,long adhaarNo,long phoneNo,String destination,String address,
	boolean confirmDate){
	
	boolean isResortApplied=false;
	
	ne= name;
	ado=adhaarNo;
	po=phoneNo;
	dn=destination;
	ad=address;
	co=confirmDate;
	
	
	
	return isResortApplied;
	}


	public static void fetchResortDetails(){
		
	System.out.println("Name is "+ne);
	System.out.println("Adhaar No "+ado);
	System.out.println("Phone No "+po);
	System.out.println("Destination "+dn);
	System.out.println("Address " +ad);
	System.out.println("Confirm Date - "+co);
	System.out.println("End Statements.....");
	}





}