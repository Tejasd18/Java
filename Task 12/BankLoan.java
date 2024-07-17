class BankLoan{

	static String bS;
	static String ad;
	static String vd;
	static double bd;
	static long bo;
	static boolean ie;


	public static boolean toApplyLoan(String bankStatements,String address,String voterId,double bankBalance,long bankAccountNo,
	boolean isBankAccSame){
	
	boolean isLoanApplied=false;
	
	bS = bankStatements;
	ad = address;
	vd = voterId;
	bd = bankBalance;
	bo = bankAccountNo;
	ie = isBankAccSame;
	
	
	
	return isLoanApplied;
	}


	public static void fetchBankLoanDetails(){
		
	System.out.println("The Bank Statements are "+bS);
	System.out.println("Address "+ad);
	System.out.println("Voter Id is "+vd);
	System.out.println("Bank Balance "+bd);
	System.out.println("Bank Acc No - " +bo);
	System.out.println("Is Bank Acc Same - "+ie);
	System.out.println("End Statements.....");
	}





}