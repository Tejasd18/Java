class LoanApplicationRunner{



	public static void main(String la[]){
	
	LoanApplication.toApplyLoan(323265478951l,"Indian Bank" ,900,6.50,"Education Loan");
	
	boolean isBankLoanApplied=true;
	
	if(isBankLoanApplied==true){
	LoanApplication.fetchBankLoanDetails();
	}else{
		System.out.println("The Loan is not Applied");
	}
	}






}