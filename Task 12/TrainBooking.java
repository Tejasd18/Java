class TrainBooking{

	static long ao;
	static long po;
	static String dn;
	static String se;
	static int so;
	static boolean ct;


	public static boolean tobookTrain(long adhaarNo,long phoneNo,String destination,String source,int selectSeatNo,
	boolean confirmTicket){
	
	boolean isTrainBooked=false;
	
	ao = adhaarNo;
	po = phoneNo;
	dn = destination;
	se = source;
	so = selectSeatNo;
	ct = confirmTicket;
	
	
	
	return isTrainBooked;
	}


	public static void fetchTrainTicket(){
		
	System.out.println("Adhaar No "+ao);
	System.out.println("Phone No "+po);
	System.out.println("Destination "+dn);
	System.out.println("source "+se);
	System.out.println("Select Seat No " +so);
	System.out.println("Confirm Ticket "+ct);
	System.out.println("End Statements.....");
	}





}