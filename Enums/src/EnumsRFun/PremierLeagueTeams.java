package EnumsRFun;

public enum PremierLeagueTeams {
	ARSENAL(3000, 12),
	MANCITY(50, 3),
	LIVERPOOL(2500, 14),
	CHELSEA(100, 4),
	MANUTD(4000, 16);
	
	final int numberOfFans;
	final int premierLeagueTitles;
	
	PremierLeagueTeams (int numberOfFans, int premierLeagueTitles){
		this.numberOfFans = numberOfFans;
		this.premierLeagueTitles = premierLeagueTitles;
	}
}
