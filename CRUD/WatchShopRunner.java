class WatchShopRunner{

	public static void main(String ws[]){
	
	System.out.println("Main Started");
	
	boolean isWatchNameAdded = WatchShop.addWatchBrandName("Rolex");
	System.out.println("Is Watch Name Added : "+isWatchNameAdded);
	isWatchNameAdded = WatchShop.addWatchBrandName("Titan");
	System.out.println("Is Watch Name Added : "+isWatchNameAdded);
	isWatchNameAdded = WatchShop.addWatchBrandName("Sonata");
	System.out.println("Is Watch Name Added : "+isWatchNameAdded);
	isWatchNameAdded = WatchShop.addWatchBrandName("G-Shock");
	System.out.println("Is Watch Name Added : "+isWatchNameAdded);
	isWatchNameAdded = WatchShop.addWatchBrandName("Fossil");
	System.out.println("Is Watch Name Added : "+isWatchNameAdded);
	isWatchNameAdded = WatchShop.addWatchBrandName("Fastrack");
	System.out.println("Is Watch Name Added : "+isWatchNameAdded);
	isWatchNameAdded = WatchShop.addWatchBrandName("Ajanta");
	System.out.println("Is Watch Name Added : "+isWatchNameAdded);
	isWatchNameAdded = WatchShop.addWatchBrandName("Citizen");
	System.out.println("Is Watch Name Added : "+isWatchNameAdded);
	isWatchNameAdded = WatchShop.addWatchBrandName("Tommy Hilfiger");
	System.out.println("Is Watch Name Added : "+isWatchNameAdded);
	isWatchNameAdded = WatchShop.addWatchBrandName("Casio");
	System.out.println("Is Watch Name Added : "+isWatchNameAdded);
	
	
	WatchShop.getWatchBrandNames();
	
	boolean isWatchNamesUpdated = WatchShop.updateWatchBrandName("Ajanta","Timex");
	System.out.println("The Updated Watch Names Are :"+isWatchNamesUpdated);
	WatchShop.getWatchBrandNames();
	
	System.out.println("Main Ended");
	}


}