class Ncr{

	public static void main(String formulaNcr[]){
	
	System.out.println("Main Started");
	int n = 8;
	int r = 7;
	
	int output = Factorial.toGetFact(n)/(Factorial.toGetFact(r)*Factorial.toGetFact(n-r)) ;
	
	System.out.println(output);
	
	System.out.println("Main Ended");
	
	}


}