package gameLevel;

public class Player {
	private PlayerLevel level;
	
	public Player() {
		level=new BeginnerLevel();
		level.showPlayerLevel();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level=level;
		level.showPlayerLevel();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
