class RedChilliesEntertainmentRunner{
	
	public static void main(String rce[]){
		
		boolean isMovieActorsAdded = RedChilliesEntertainment.addMovieActors("Hrithik Roshan");
		System.out.println(isMovieActorsAdded);
		isMovieActorsAdded = RedChilliesEntertainment.addMovieActors("Kiara Advani");
		System.out.println(isMovieActorsAdded);
		isMovieActorsAdded = RedChilliesEntertainment.addMovieActors("Shah Rukh Khan");
		System.out.println(isMovieActorsAdded);
		isMovieActorsAdded = RedChilliesEntertainment.addMovieActors("Salman Khan");
		System.out.println(isMovieActorsAdded);
		isMovieActorsAdded = RedChilliesEntertainment.addMovieActors("Kapil Sharma");
		System.out.println(isMovieActorsAdded);
		isMovieActorsAdded = RedChilliesEntertainment.addMovieActors("Kriti Sanon");
		System.out.println(isMovieActorsAdded);
		isMovieActorsAdded = RedChilliesEntertainment.addMovieActors("Deepika Padukoni");
		System.out.println(isMovieActorsAdded);
		isMovieActorsAdded = RedChilliesEntertainment.addMovieActors("Alia Bhatt");
		System.out.println(isMovieActorsAdded);
		isMovieActorsAdded = RedChilliesEntertainment.addMovieActors("Disha Patani");
		System.out.println(isMovieActorsAdded);
		
		RedChilliesEntertainment.getMovieActors();
		
		boolean rr = RedChilliesEntertainment.updateMovieActor("Kriti Sanon","Nora Fatehi");
		System.out.println(rr);
		RedChilliesEntertainment.getMovieActors();
		
		System.out.println("Main Ended");
	}
	
	
	
	
	
	
	
	
}