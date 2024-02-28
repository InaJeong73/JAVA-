package test2;

public class CardCompany {
	private static CardCompany instance=new CardCompany();
	//해당 클래스형 인스턴스가 단 하나만 필요하므로 내부에서 생성(static), but 외부에서 내용을 함부로 변경할 수 없게 해당 인스턴스에 접근할 수 없도록 함.(private)
	private CardCompany() {}
	//외부에서 CardCompany 형 인스턴스를 생성할 수 없도록 private로 설정
	public static CardCompany getInstance() {
		if(instance==null) {
			instance=new CardCompany();
		}
		return instance;
	}
	// public 접근 제어자를 이용하여 다른 클래스에서 갖다 쓸 수 있도록 함
	public Card cardIssuance() {
		Card newCard=new Card();
		return newCard;
	}
}
