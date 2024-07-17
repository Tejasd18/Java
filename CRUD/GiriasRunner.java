class GiriasRunner{

	public static void main(String gg[]){
	System.out.println("Main Started");
	
	boolean ha = Girias.createHomeApplication("Television");
	System.out.println("The Home Application are : "+ha);
	ha = Girias.createHomeApplication("Refrigerator");
	System.out.println("The Home Application are : "+ha);
	ha = Girias.createHomeApplication("Washing Machine");
	System.out.println("The Home Application are : "+ha);
	ha = Girias.createHomeApplication("Grinder");
	System.out.println("The Home Application are : "+ha);
	ha = Girias.createHomeApplication("Mixer");
	System.out.println("The Home Application are : "+ha);
	ha = Girias.createHomeApplication("Gas Stove");
	System.out.println("The Home Application are : "+ha);
	ha = Girias.createHomeApplication("Microwave Oven");
	System.out.println("The Home Application are : "+ha);
	ha = Girias.createHomeApplication("Cooker Kettle");
	System.out.println("The Home Application are : "+ha);
	ha = Girias.createHomeApplication(null);
	System.out.println("The Home Application are : "+ha);
	ha = Girias.createHomeApplication(null);
	System.out.println("The Home Application are : "+ha);
	ha = Girias.createHomeApplication("Hot Water Kettle");
	System.out.println("The Home Application are : "+ha);
	ha = Girias.createHomeApplication(null);
	System.out.println("The Home Application are : "+ha);
	
	Girias.getHomeApplications();
	
	Girias.updateHomeApp("Gas Stove","Air Cooler");
	Girias.getHomeApplications();
	
	System.out.println("Main Ended");
	}









}