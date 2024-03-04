package gameLevel;

import java.util.ArrayList;

public class PlayerTest {
	public static void main(String[]args) {
		Player player=new Player();
		player.play(1);
		
		PlayerLevel ilevel=new IntermediateLevel();
		player.upgradeLevel(ilevel);
		
		player.play(2);

		PlayerLevel alevel=new AdvancedLevel();
		player.upgradeLevel(alevel);
		
		player.play(3);

	}

}
