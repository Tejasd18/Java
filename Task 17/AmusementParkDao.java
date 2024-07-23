class AmusementParkDao{
    
	AmusementParkDto dto;
	
	/*public void play(){
	}
	public boolean createPark(String name, String place, int noOfGames,int id) {
        boolean isParkCreated = false;
        if (name != null && place != null && noOfGames > 0) {
            this.name = name;
            this.place = place;
            this.noOfGames = noOfGames;
			this.id = id;
            isParkCreated = true;
        }
        return isParkCreated;
    }*/

    public void displayParkInfo() {
        System.out.println("********************************");
        System.out.println("Park Name: " + this.name);
        System.out.println("Location: " + this.place);
        System.out.println("Number of Games: " + this.noOfGames);
		System.out.println("Id is " + this.id);
        System.out.println("********************************");
    }
}