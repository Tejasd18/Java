class SimCard {
    
	String name;
    String plan;
    double price; 
	int id;
	
	public SimCard(String name,String plan,double price,int id){
		
		this.name=name;
		this.plan=plan;
		this.price=price;
		this.id=id;
		
	}
	
	/*public void communication(){
	}
	public boolean createSimCard(String name, String plan, double price,int id) {
        boolean isSimCardCreated = false;
        if (name != null && plan != null && price > 0.0) {
            this.name = name;
            this.plan = plan;
            this.price = price;
			this.id = id;
            isSimCardCreated = true;
        }
        return isSimCardCreated;
    }*/

    public void displaySimCardInfo() {
        System.out.println("********************************");
        System.out.println("Name of Sim Card: " + this.name);
        System.out.println("Plan: " + this.plan);
        System.out.println("Price: " + this.price);
		System.out.println("Id is " + this.id);
        System.out.println("********************************");
    }
}