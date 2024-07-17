class SportsMania{

	static String iplTeamNames[] = {"CSK", "RCB", "MI", "PBSK", "GT", "SRH", "RR"};
	static String top10BatsMens[] = {"Dhoni", "Virat", "Suresh Raina", "Jadeja", "Suryakumar Yadav", "Hardik", "Dube", "Maxi", "ABDevillers", "Faf"};
	static String top10Bowlers[] = {"Loki Ferguson", "Josh hazelwood", "Pat Cummins", "Bummra", "Yuzi", "Deepak Chahar", "Bravo", "Jofra", "Ashwin", "Sunil Narine"};
	static String top10IccTeamNames[] = {"India", "Australia", "England", "South Africa", "Pakistan", "New Zealand", "West Indies", "Sri Lanka", "Afghanistan", "Bangladesh"};
	
	public static void main(String achievement[]){
	
	for(int index = 0; index < iplTeamNames.length ; index++ ){
		System.out.println(iplTeamNames[index]);
	}
	System.out.println("********************************");
	
	for(int index = 0; index < top10BatsMens.length ; index++ ){
		System.out.println(top10BatsMens[index]);
	}
	System.out.println("********************************");
	
	for(int index = 0; index < top10Bowlers.length ; index++ ){
		System.out.println(top10Bowlers[index]);
	}
	System.out.println("********************************");
	
	for(int index = 0; index < top10IccTeamNames.length ; index++ ){
		System.out.println(top10IccTeamNames[index]);
	}
	}
}