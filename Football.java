class Football{
	String playerName;
	int runs;
	float avg;
	
	Football(){
		this.playerName = playerName;
		this.runs = runs;
		this.avg = avg;
	}
	
	Football(String playerName, int runs, float avg){
		this.playerName = playerName;
		this.runs = runs;
		this.avg = avg;
	}
	
	public void setProfile(String playerName, int runs, float avg){
		this.playerName = playerName;
		this.runs = runs;
		this.avg = avg;
	}
	
	public String getName(){
		return playerName;
	}
	public int getRuns(){
		return runs;
	}
	public float getAvg(){
		return avg;
	}
}