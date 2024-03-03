package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customrLee=new Customer();
		customrLee.setCustomerID(10010);
		customrLee.setCustomerName("이순신");
		customrLee.bonusPoint=1000;
		System.out.println(customrLee.showCustomerInfo());
		
		VIPCustomer customerKim=new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint=10000;
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
