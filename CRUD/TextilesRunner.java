class TextilesRunner{

	public static void main(String tt[]){
	System.out.println("Main Started");
	
	boolean isTextileAdd= Textiles.addMaterial("Cotton");
	System.out.println("Is Textile Added : "+isTextileAdd);
	isTextileAdd= Textiles.addMaterial("Polyester");
	System.out.println("Is Textile Added : "+isTextileAdd);
	isTextileAdd= Textiles.addMaterial("Silk");
	System.out.println("Is Textile Added : "+isTextileAdd);
	isTextileAdd= Textiles.addMaterial("Wool");
	System.out.println("Is Textile Added : "+isTextileAdd);
	isTextileAdd= Textiles.addMaterial("Linen");
	System.out.println("Is Textile Added : "+isTextileAdd);
	isTextileAdd= Textiles.addMaterial("Nylon");
	System.out.println("Is Textile Added : "+isTextileAdd);
	isTextileAdd= Textiles.addMaterial("Rayon");
	System.out.println("Is Textile Added : "+isTextileAdd);
	isTextileAdd= Textiles.addMaterial("Velvet");
	System.out.println("Is Textile Added : "+isTextileAdd);
	isTextileAdd= Textiles.addMaterial("Satin");
	System.out.println("Is Textile Added : "+isTextileAdd);
	isTextileAdd= Textiles.addMaterial("Denim");
	System.out.println("Is Textile Added : "+isTextileAdd);
	isTextileAdd= Textiles.addMaterial("Flannel");
	System.out.println("Is Textile Added : "+isTextileAdd);
	isTextileAdd= Textiles.addMaterial("Cashmere");
	System.out.println("Is Textile Added : "+isTextileAdd);
	isTextileAdd= Textiles.addMaterial("Chiffon");
	System.out.println("Is Textile Added : "+isTextileAdd);
	isTextileAdd= Textiles.addMaterial("Fleece");
	System.out.println("Is Textile Added : "+isTextileAdd);
	isTextileAdd= Textiles.addMaterial("Lycra");
	System.out.println("Is Textile Added : "+isTextileAdd);
	
	Textiles.getAllMaterials();
	
	
	boolean isTextileUpd = Textiles.updateMaterialName("Flannel","Kathi");
	System.out.println("The Updated Textile Materials Are : "+isTextileUpd);
	Textiles.getAllMaterials();
	
	System.out.println("Main Ended");
	}






}