class AtmMachine{


	String userName;
	long accountNo;
	int pin;
	int id;
	
	public AtmMachine(String userName,long accountNo,int pin,int id){
		
		this.userName=userName;
		this.accountNo=accountNo;
		this.pin=pin;
		this.id=id;
	}
	
	
	/*public void money(){
	}
	public boolean createAtmMachine(String userName, long accountNo, int pin,int id) {
        boolean isAtmMachineCreated = false;
        if (userName != null && accountNo > 0 && pin > 0) {
            this.userName = userName;
            this.accountNo = accountNo;
            this.pin = pin;
			this.id = id;
            isAtmMachineCreated = true;
        }
        return isAtmMachineCreated;
    }*/

    public void displayAtmMachineInfo() {
        System.out.println("********************************");
        System.out.println("User Name: " + this.userName);
        System.out.println("Account No: " + this.accountNo);
        System.out.println("Pin: " + this.pin);
		System.out.println("Id is " + this.id);
        System.out.println("********************************");
    }


}