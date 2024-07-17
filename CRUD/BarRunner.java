class BarRunner{

	public static void main(String br[]){
	System.out.println("Main Started");
	
	
	boolean isWineNameAdded = Bar.addWineBrandName("IB");
	System.out.println("Is Wine Name Added : "+isWineNameAdded);
	isWineNameAdded = Bar.addWineBrandName("Old Monk");
	System.out.println("Is Wine Name Added : "+isWineNameAdded);
	isWineNameAdded = Bar.addWineBrandName("MH");
	System.out.println("Is Wine Name Added : "+isWineNameAdded);
	isWineNameAdded = Bar.addWineBrandName("Vodka");
	System.out.println("Is Wine Name Added : "+isWineNameAdded);
	isWineNameAdded = Bar.addWineBrandName("OT");
	System.out.println("Is Wine Name Added : "+isWineNameAdded);
	isWineNameAdded = Bar.addWineBrandName("Tuborg");
	System.out.println("Is Wine Name Added : "+isWineNameAdded);
	isWineNameAdded = Bar.addWineBrandName("KingFisher");
	System.out.println("Is Wine Name Added : "+isWineNameAdded);
	isWineNameAdded = Bar.addWineBrandName("Ulta KingFisher");
	System.out.println("Is Wine Name Added : "+isWineNameAdded);
	isWineNameAdded = Bar.addWineBrandName("Corona");
	System.out.println("Is Wine Name Added : "+isWineNameAdded);
	isWineNameAdded = Bar.addWineBrandName("Calsberg");
	System.out.println("Is Wine Name Added : "+isWineNameAdded);
	isWineNameAdded = Bar.addWineBrandName("BareFoot");
	System.out.println("Is Wine Name Added : "+isWineNameAdded);
	isWineNameAdded = Bar.addWineBrandName("CockTail");
	System.out.println("Is Wine Name Added : "+isWineNameAdded);
	isWineNameAdded = Bar.addWineBrandName("Jacob's Creek");
	System.out.println("Is Wine Name Added : "+isWineNameAdded);
	isWineNameAdded = Bar.addWineBrandName("Breezer");
	System.out.println("Is Wine Name Added : "+isWineNameAdded);
	isWineNameAdded = Bar.addWineBrandName("JD");
	System.out.println("Is Wine Name Added : "+isWineNameAdded);
	
	
	Bar.getWineBrands();
	
	
	boolean isBrNameUpdated=Bar.updateWineBrandName("Breezer","Water");
	System.out.println("The Updated Wine Names Are : "+isBrNameUpdated);
	Bar.getWineBrands();
	
	System.out.println("Main Ended");
	}









}