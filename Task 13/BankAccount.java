class BankAccount{

	static double balance;
	
	public static void credit(double amount){
	System.out.println("Credit Started");
	if(amount>0)
	balance=balance+amount;
	
	System.out.println("Credit Ended");
	return;
	}

	public static void debit(double amount){
	System.out.println("Debit Started");
	if(amount<=balance)
	
	balance=balance-amount;
	else{
		System.out.println("Insufficient Balance");
	}
	System.out.println("Debit Ended");
	return;
	}

	public static double getBalanceDetails(){
	System.out.println("Fetching the Balance....");
	
	return balance;
	}






}