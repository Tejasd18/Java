class Sbi{
	
		static String Nm;
		static String pN;
		static String db;
		static int Age;
		static long ad;
		static String panNo;
		static String em;
		static String nm;
		static String accType;


		public static boolean toCreateAccount(String name, String phoneNo, String dob, int age, long adhaarNo, String pan,
		String email, String nominee, String typeOfAcc){
		
		boolean isAccountCreated=false;
		boolean isNameValid=false;
		boolean isPhoneNoValid=false;
		boolean isDobValid=false;
		boolean isAgeValid=false;
		boolean isAdhaarNoValid=false;
		boolean isPanValid=false;
		boolean isEmailValid=false;
		boolean isNomineeValid=false;
		boolean isAccTypeValid=false;
		
		System.out.println("Validation Started---");
		if(name!=null ){
		Nm = name;
		isNameValid=true;
		}else{
			System.out.println("Please provide valid name ");
		}
		if(phoneNo!=null){
			pN = phoneNo;
			isPhoneNoValid=true;
		}else{
			System.out.println("Please provide valid Phone No ");
		}if(dob!=null){
			db = dob;
			isDobValid=true;
		}else{
			System.out.println("Please provide valid date of birth ");
		}
		if(age != 0){
			Age = age;
			isAgeValid=true;
		}else{
			System.out.println("Please provide valid Age ");
		}
		if(adhaarNo!=0){
			ad = adhaarNo;
			isAdhaarNoValid=true;
		}else{
			System.out.println("Please provide valid Adhaar No ");
		}
		if(pan!=null){
			panNo = pan;
			isPanValid=true;
		}else{
			System.out.println("Please provide valid Pan ");
		}
		if(email!=null){
			em = email;
			isEmailValid=true;
		}else{
			System.out.println("Please provide valid Email ");
		}
		if(nominee!=null){
			nm = nominee;
			isNomineeValid=true;
		}else{
			System.out.println("Please provide valid Nominee ");
		}
		if(typeOfAcc!=null){
			accType = typeOfAcc;
			isAccTypeValid=true;
		}else{
			System.out.println("Please provide valid Type Of Account ");
		}
		
		if(isNameValid && isPhoneNoValid && isDobValid && isAgeValid && isAdhaarNoValid && isPanValid && isEmailValid && isNomineeValid && isAccTypeValid){
		isAccountCreated = true;
		}else{
			System.out.println("The Details are missing");
		}
		
		System.out.println("Validation Ended---");
		return isAccountCreated;
		}

		public static void getAccDetails(){
		System.out.println("The Holder's Name is "+Nm);
		System.out.println("Phone Number is "+pN);
		System.out.println("Date Of Birth "+db);
		System.out.println("Current Age is "+Age);
		System.out.println("Adhaar Number is "+ad);
		System.out.println("Pan Id is "+panNo);
		System.out.println("Email Provided is "+em);
		System.out.println("Nominee is "+nm);
		System.out.println("Account Typte is "+accType);
		
		
		}











}