package interfaceex;

public class CustomerTest {
	public static void main(String[]args) {
		Customer customer=new Customer();
		
		Buy buyer=customer;
		buyer.buy();
		buyer.order();
		
		Sell seller=customer;
		seller.sell();
		seller.order();
		
		//instanceof를 사용하여 본래 인스턴스 자료형으로 안전하게 변환
		if(seller instanceof Customer) {
			Customer customer2=(Customer) seller;
			customer2.buy();
			customer2.sell();
			customer2.order();
		}
	}
}
