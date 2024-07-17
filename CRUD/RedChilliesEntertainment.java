class RedChilliesEntertainment{
	
	static String movieActors[]={null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addMovieActors(String movieActor)
	{
		boolean isMovieActorAdded=false;
		
		if(movieActor!=null){
			movieActors[index]=movieActor;
			index++;
			isMovieActorAdded=true;
		}
		return isMovieActorAdded;
	}
	
	
	public static void getMovieActors(){
	
		for(String mA:movieActors)System.out.println(mA);
		
		
	}
	
	public static boolean updateMovieActor(String oldName,String newName){
		boolean isMovieActorUpdated=false;
		
		for(int i=0;i<movieActors.length;i++){
			if(oldName==movieActors[i]){
				movieActors[i]=newName;
				isMovieActorUpdated=true;
			}
		}if(isMovieActorUpdated==false){
			System.out.println("The Movie Actors are not Updated ");
		}
		
		return isMovieActorUpdated;
	}
	
	
	
	
	
	
}