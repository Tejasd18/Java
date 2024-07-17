class GoldShopRunner{

	public static void main(String gs[]){
	
	System.out.println("Main Started");
	
	boolean gg = GoldShop.addGoldItem("Gold Ring ");
	System.out.println(gg);
	gg = GoldShop.addGoldItem("Gold Necklace ");
	System.out.println(gg);
	gg = GoldShop.addGoldItem("Gold Earrings ");
	System.out.println(gg);
	gg = GoldShop.addGoldItem("Gold Chain");
	System.out.println(gg);
	gg = GoldShop.addGoldItem("Gold Bracelet ");
	System.out.println(gg);
	gg = GoldShop.addGoldItem("Gold Bangles ");
	System.out.println(gg);
	gg = GoldShop.addGoldItem("Gold Brooch ");
	System.out.println(gg);
	
	GoldShop.getGoldItems();
	
	boolean ss = GoldShop.UpdateGoldItem("Gold Ring ","Gold KeyChain");
	System.out.println("The Updated Gold Items Are :"+ss);
	GoldShop.getGoldItems();
	
	System.out.println("Main Ended");
	}









}