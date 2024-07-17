class Xworkz{
    static String fn;
    static long pr;
    static long wr;
    static String em;
    static String un;
    

    public static boolean registerTrainee(String fullName, long phoneNumber, long whatsAppNumber,
	String emailId, String usnNumber) 
	{
	boolean isTraineeIDCreated=false;
    boolean isFullNameValid = false;
    boolean isPhoneNumberValid = false;
    boolean isWhatsAppNumberValid = false;
    boolean isEmailIdValid = false;
    boolean isUsnNumberValid = false;
	
	if(fullName != null){
		fn = fullName;
        isFullNameValid = true;
    }else{
        System.out.println("Please enter a valid full name.");
    }
	if(phoneNumber != 0){
       pr = phoneNumber;
       isPhoneNumberValid = true;
    }else{
      System.out.println("Please enter a valid phone number.");
        }
	if(whatsAppNumber != 0) {
       wr = whatsAppNumber;
       isWhatsAppNumberValid = true;
    }else{
       System.out.println("Please enter a valid WhatsApp number.");
    }
    if(emailId != null) {
        em = emailId;
        isEmailIdValid = true;
    }else{
        System.out.println("Please enter a valid email ID.");
    }
    if(usnNumber != null) {
        un = usnNumber;
        isUsnNumberValid = true;
    }else{
        System.out.println("Please enter a valid USN number.");
    }
    if(isFullNameValid && isPhoneNumberValid && isWhatsAppNumberValid &&
	isEmailIdValid && isUsnNumberValid) {
        isTraineeIDCreated = true;
    }else{
		System.out.println("Trainee Details are Missing");
	}

    return isTraineeIDCreated;
    }

    public static void getTraineeDetails() {
      
            System.out.println("The full name is: " + fn);
            System.out.println("The phone number is: " + pr);
            System.out.println("The WhatsApp number is: " + wr);
            System.out.println("The email ID is: " + em);
            System.out.println("The USN number is: " + un);
        
    }
}
