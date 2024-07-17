class TeaShopRunner{


	public static void main(String ts[]){
	
	
	boolean isTeaAdded=TeaShop.addTeaName("lemon Tea");
	System.out.print(" is tea name added :"+isTeaAdded);
	//boolean isTeaPriceAdded = TeaShop.addTeaPrice(30.00);
	//System.out.println(isTeaPriceAdded);
	isTeaAdded=TeaShop.addTeaName("Ginger Tea");
	System.out.println("is tea name added :"+isTeaAdded);
	isTeaAdded=TeaShop.addTeaName("Tea");
	System.out.println("is tea name added :"+isTeaAdded);
	isTeaAdded=TeaShop.addTeaName("Boost Tea");
	System.out.println("is tea name added :"+isTeaAdded);
	isTeaAdded=TeaShop.addTeaName("Green Tea");
	System.out.println("is tea name added :"+isTeaAdded);
	
	
	TeaShop.getAddedTeaNames();
	
	
	TeaShop.updateTeaName("lemon Tea","Coffee");
	TeaShop.getAddedTeaNames();
	
	
	}







}