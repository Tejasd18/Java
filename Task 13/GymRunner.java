class GymRunner{


	public static void main(String g[]){
	
	System.out.println("main started");
	
	boolean isGymEqipAdded = Gym.createGymEquipment("Dumbbells");
	System.out.println("The Eqipments are : "+isGymEqipAdded);
	boolean addPrice = Gym.addPriceValue(20);
	System.out.println(addPrice);
	isGymEqipAdded = Gym.createGymEquipment("Weigth Lift");
	System.out.println("The Eqipments are : "+isGymEqipAdded);
	isGymEqipAdded = Gym.createGymEquipment("Bench");
	System.out.println("The Eqipments are : "+isGymEqipAdded);
	isGymEqipAdded = Gym.createGymEquipment("Treadmill");
	System.out.println("The Eqipments are : "+isGymEqipAdded);
	isGymEqipAdded = Gym.createGymEquipment("Leg Press Machine");
	System.out.println("The Eqipments are : "+isGymEqipAdded);
	isGymEqipAdded = Gym.createGymEquipment("Chest Press Machine");
	System.out.println("The Eqipments are : "+isGymEqipAdded);
	isGymEqipAdded = Gym.createGymEquipment("Spin Bike");
	System.out.println("The Eqipments are : "+isGymEqipAdded);
	isGymEqipAdded = Gym.createGymEquipment(null);
	System.out.println("The Eqipments are : "+isGymEqipAdded);
	
	
	Gym.getGymEquipments();
	
	boolean gy=Gym.updateGymNames("Bench","Skipping");
	System.out.println(gy);
	Gym.getGymEquipments();

	System.out.println("main ended");
	}






}