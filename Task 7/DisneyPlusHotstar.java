class DisneyPlusHotstar{

	static String top10Movies[] = {"Avengers Endgame", "The Lion King", "Frozen II", "Aladdin", "The Mandalorian", "Toy Story 4","The Avengers", "Finding Nemo", "Beauty and the Beast", "Moana"}; 
	static String englishMovies[] = {"Avengers Endgame", "The Lion King", "Frozen II", "Aladdin", "Toy Story 4", "The Avengers", "Finding Nemo", "Beauty and the Beast", "Moana", "Star Wars The Rise of Skywalker", "Captain Marvel", "The Incredibles 2", "Coco", "Guardians of the Galaxy", "Zootopia", "Inside Out", "Pirates of the Caribbean The Curse of the Black Pearl", "Ratatouille", "Avengers Infinity War", "Maleficent Mistress of Evil", "Big Hero 6", "Up", "The Jungle Book", "Monsters", "The Little Mermaid"};
	static String kannadaMovies[] = {"Kirik Party", "KGF Chapter 1", "Ulidavaru Kandanthe", "RangiTaranga", "Raajakumara", "Lucia", "Dandupalya 2", "Dandupalya 3", "Mungaru Male", "Aa Karaala Ratri", "Gultoo", "Mugulu Nage", "Bell Bottom", "Ondu Motteya Kathe", "Kendasampige", "U Turn", "Chowka", "Rajakumara", "Avane Srimannarayana", "Tagaru", "Chamak", "Natasaarvabhowma", "Sarkari Hiriya Prathamika Shaale", "Aa Dinagalu", "Jaggesh"};
	static String hindiMoviesOrSeries[] = {"Kasautii Zindagii Kay", "Yeh Rishta Kya Kehlata Hai", "Yeh Hai Mohabbatein", "Iss Pyaar Ko Kya Naam Doon", "Saath Nibhaana Saathiya", "Diya Aur Baati Hum", "Mahabharat", "Saraswatichandra", "Kyunki Saas Bhi Kabhi Bahu Thi", "Kahaani Ghar Ghar Kii", "Pavitra Rishta", "Kasamh Se", "Chandra Nandini", "Nazar", "Divya-Drishti", "Kulfi Kumar Bajewala", "Nimki Mukhiya", "Mere Angne Mein", "Qayamat Ki Raat", "Dil Toh Happy Hai Ji", "Kullfi Kumarr Bajewala", "Yeh Hai Mohabbatein", "Bhakharwadi", "Yeh Rishta Kya Kehlata Hai", "Nazar"};
	static String animeSeries[] = {"One Piece", "Naruto", "Naruto Shippuden", "Dragon Ball", "Dragon Ball Z", "Dragon Ball Super", "My Hero Academia", "Death Note", "Demon Slayer", "Attack On Titan", "Bleach", "Sword Art Online", "Fullmetal Alchemist Brotherhood", "Tokyo Ghoul", "Hunter xHunter", "Fairy Tail", "Classroom of Elite", "Black Clover", "InuYasha", "Yu Yu Hakusho"};

	
	public static void main(String[] moviesOrSeries){
	
	for(int index = 0 ; index < top10Movies.length ; index++ ){
	System.out.println(top10Movies[index]);
	}
	System.out.println("********************************");
	
	for(int index = 0 ; index < englishMovies.length ; index++ ){
	System.out.println(englishMovies[index]);
	}
	System.out.println("********************************");
	
	for(int index = 0 ; index < kannadaMovies.length ; index++ ){
	System.out.println(kannadaMovies[index]);
	}
	System.out.println("********************************");
	
	for(int index = 0 ; index < hindiMoviesOrSeries.length ; index++ ){
		System.out.println(hindiMoviesOrSeries[index]);
	}
	System.out.println("********************************");
	
	for(int index = 0 ; index < animeSeries.length ; index++ ){
	System.out.println(animeSeries[index]);}
	}

}