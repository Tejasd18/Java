class Factorial{


	public static int toGetFact(int factNumber){
	int fact = 1;
	System.out.println("fact method is started ");
	for(int num = 1; num <= factNumber ; num++){
	
		fact = num * fact;
	}
	System.out.println("fact method is ended");
	
	return fact;
	
	
	}






}