package operator;

public class OperatorEx2 {
	public static void main(String[]args) {
		int gameScore=150;
		
		int lastScore1=gameScore++;
		System.out.println("lastScore1:"+lastScore1);
		
		System.out.println("gameScore:"+gameScore);
		
		int lastScore2=gameScore--;
		System.out.println("lastScore2:"+lastScore2);
		
		System.out.println("gameScore:"+gameScore);

	}
}
