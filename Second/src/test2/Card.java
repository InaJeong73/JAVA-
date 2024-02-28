package test2;

public class Card {
	public static int serialNum=1000;
	private int cardNum;
	
	public Card() {
		serialNum++;
		cardNum=serialNum;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	}
