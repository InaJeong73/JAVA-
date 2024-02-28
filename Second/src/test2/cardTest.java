package test2;

public class cardTest {
	public static void main(String[]args) {
		CardCompany cardCompany=CardCompany.getInstance();
		Card card1=cardCompany.cardIssuance();
		Card card2=cardCompany.cardIssuance();
		
		System.out.println(card1.getCardNum()+"번 카드를 발급하였습니다.");
		System.out.println(card2.getCardNum()+"번 카드를 발급하였습니다.");
		
	}
}
