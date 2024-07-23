class AgarbathiDto{

	String brandName;
    int qty ;
    String fragrance ;
    double price ;
    String mgfDate;
    String expDate ;
	int id;
	
	
	public Agarbathi(String brandName,int qty,String fragrance,double price,
	String mgfDate,String expDate,int id){
		System.out.println("Initialized Paramter is Created");
		
		this.brandName=brandName;
		this.qty=qty;
		this.fragrance=fragrance;
		this.price=price;
		this.mgfDate=mgfDate;
		this.expDate=expDate;
		this.id=id;
		
	}




}