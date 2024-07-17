class ShoesRunner{

	public static void main(String sr[]){
	System.out.println("Main Started");
	
	
	boolean isShoeAdded = Shoes.addShoeBrand("Adidas");
	System.out.println("Is Shoe Brand Name Added : "+isShoeAdded);
	isShoeAdded = Shoes.addShoeBrand("Nike");
	System.out.println("Is Shoe Brand Name Added : "+isShoeAdded);
	isShoeAdded = Shoes.addShoeBrand("Puma");
	System.out.println("Is Shoe Brand Name Added : "+isShoeAdded);
	isShoeAdded = Shoes.addShoeBrand("Reebok");
	System.out.println("Is Shoe Brand Name Added : "+isShoeAdded);
	isShoeAdded = Shoes.addShoeBrand("New Balance");
	System.out.println("Is Shoe Brand Name Added : "+isShoeAdded);
	isShoeAdded = Shoes.addShoeBrand("Converse");
	System.out.println("Is Shoe Brand Name Added : "+isShoeAdded);
	isShoeAdded = Shoes.addShoeBrand("Vans");
	System.out.println("Is Shoe Brand Name Added : "+isShoeAdded);
	isShoeAdded = Shoes.addShoeBrand("TimberLand");
	System.out.println("Is Shoe Brand Name Added : "+isShoeAdded);
	isShoeAdded = Shoes.addShoeBrand("Sketchers");
	System.out.println("Is Shoe Brand Name Added : "+isShoeAdded);
	isShoeAdded = Shoes.addShoeBrand("ASICS");
	System.out.println("Is Shoe Brand Name Added : "+isShoeAdded);
	isShoeAdded = Shoes.addShoeBrand("Under Armour");
	System.out.println("Is Shoe Brand Name Added : "+isShoeAdded);
	isShoeAdded = Shoes.addShoeBrand("Clarks");
	System.out.println("Is Shoe Brand Name Added : "+isShoeAdded);
	isShoeAdded = Shoes.addShoeBrand("Brooks");
	System.out.println("Is Shoe Brand Name Added : "+isShoeAdded);
	isShoeAdded = Shoes.addShoeBrand("Crocs");
	System.out.println("Is Shoe Brand Name Added : "+isShoeAdded);
	isShoeAdded = Shoes.addShoeBrand("Gucci");
	System.out.println("Is Shoe Brand Name Added : "+isShoeAdded);
	
	Shoes.getShoeBrands();
	
	
	boolean isShoeNameUpd =Shoes.updateShoeBrandName("Clarks","Loafers");
	System.out.println("The Updated Shoe Names Are :"+isShoeNameUpd);
	Shoes.getShoeBrands();
	
	System.out.println("Main Ended");
	}








}