class GardenDao {
	
	GardenDto dto;
	
	/*public void gettingFreshAir(){
	}
	
	public boolean createGarden(String name, String location, double sizeInAcres,int id) {
        boolean isGardenCreated = false;
        if (name != null && location != null && sizeInAcres > 0) {
            this.name = name;
            this.location = location;
            this.sizeInAcres = sizeInAcres;
			this.id = id;
            isGardenCreated = true;
        }
        return isGardenCreated;
    }*/

    public void displayGardenInfo() {
		System.out.println("******************************************");
        System.out.println("Garden Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Size (in acres): " + this.sizeInAcres);
		System.out.println("Id is " +this.id);
		System.out.println("******************************************");
	}
}