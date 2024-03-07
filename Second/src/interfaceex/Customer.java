package interfaceex;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("구매하기");		
	}

	@Override
	public void buy() {
		System.out.println("판매하기");		
	}

	@Override
	public void order() {
		System.out.println("고객 판매 주문");
	}
	//order()은 Buy,Sell에 둘다 정의된 디폴트 메서드이므로, 상속받을 때 혼선이 오지 않도록 재정의 해줘야함.
	
}
