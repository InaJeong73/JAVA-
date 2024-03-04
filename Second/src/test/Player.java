package test;

public class Player {
	private PlayerLevel level;
	
	public Player() {
		level=new BeginnerLevel();
		level.showLevelInfo();
	}
	
	public void play(int count) {
		level.go(count);
	}
	public void upgradeLevel(PlayerLevel level) {
		this.level=level;
		level.showLevelInfo();
	}
}
