class BankAccountRunner{



	public static void main(String ba[]){
	
	BankAccount.credit(1500.00);
	double finalAmount=BankAccount.getBalanceDetails();
	System.out.println(finalAmount);
	BankAccount.credit(1545.50);
	finalAmount=BankAccount.getBalanceDetails();
	System.out.println(finalAmount);
	BankAccount.credit(1550.50);
	finalAmount=BankAccount.getBalanceDetails();
	System.out.println(finalAmount);
	BankAccount.debit(560.60);
	finalAmount=BankAccount.getBalanceDetails();
	System.out.println(finalAmount);
	BankAccount.debit(600.60);
	finalAmount=BankAccount.getBalanceDetails();
	System.out.println(finalAmount);
	BankAccount.debit(1500);
	finalAmount=BankAccount.getBalanceDetails();
	System.out.println("Final Balance is "+finalAmount);
	
	}








}