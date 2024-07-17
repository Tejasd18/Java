class FlightBooking{

	static String ne;
	static long ao;
	static long po;
	static String dn;
	static int so;
	static boolean ct;


	public static boolean tobookFlight(String name,long adhaarNo,long phoneNo,String destination,int selectSeatNo,
	boolean confirmTicket){
	
	boolean isFlightBooked=false;
	
	ne = name;
	ao = adhaarNo;
	po = phoneNo;
	dn = destination;
	so = selectSeatNo;
	ct = confirmTicket;
	
	
	
	return isFlightBooked;
	}


	public static void fetchFlightTicket(){
		
	System.out.println("Name "+ne);
	System.out.println("Adhaar No "+ao);
	System.out.println("Phone No "+po);
	System.out.println("Destination "+dn);
	System.out.println("Select Seat No " +so);
	System.out.println("Confirm Ticket "+ct);
	System.out.println("End Statements.....");
	}





}