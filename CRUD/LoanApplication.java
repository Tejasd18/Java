class LoanApplication{

	static long bn;
	static String ba;
	static int cs;
	static double ri;
	static String lt;

	public static boolean toApplyLoan(long bankAccountNo, String bankName,
		int creditScore, double rateOfInterest,String loanType){
		
	boolean isBankLoanApplied=false;
	boolean isbankAccountNoValid=false;
	boolean isbankNameValid=false;
	boolean iscreditScoreValid=false;
	boolean israteOfInterestValid=false;
	boolean isloanTypeValid=false;
	
	if(bankAccountNo!=0){
		bn = bankAccountNo;
		isbankAccountNoValid=true;
	}else{
		System.out.println("Please provide a valid Bank Acc No ");
	}
	if(bankName!=null){
		ba= bankName;
		isbankNameValid=true;
	}else{
		System.out.println("Please provide a valid Bank Name ");
	}
	if(creditScore!=0){
		cs=creditScore;
		iscreditScoreValid=true;
	}else{
		System.out.println("Please provide a valid Credit Score ");
	}
	if(rateOfInterest!=0.0){
		ri = rateOfInterest;
		israteOfInterestValid=true;
	}else{
		System.out.println("Please provide a valid Rate Of Interest ");
	}
	if(loanType!=null){
		lt=loanType;
		isloanTypeValid=true;
	}else{
		System.out.println("Please tell a valid loan type ");
	}
	
	if(isbankAccountNoValid && isbankNameValid && iscreditScoreValid && israteOfInterestValid && isloanTypeValid){
		 isBankLoanApplied=true;
	}
		
		
		
		
	return isBankLoanApplied;
	}

	public static void fetchBankLoanDetails(){
	System.out.println("The Bank Acc No is : "+bn);
	System.out.println("Bank Name is : "+ba);
	System.out.println("Credit Score : "+cs);
	System.out.println("Rate Of Interest : "+ri);
	System.out.println("Type of Loan : "+lt);
	
	
	
	
	
	
	}





}