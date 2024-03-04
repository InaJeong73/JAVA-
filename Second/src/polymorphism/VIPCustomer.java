package polymorphism;


public class VIPCustomer extends Customer{
	private double saleRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID,customerName);
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		this.agentID=agentID;
		//System.out.println("VIPCustomer(int, String) 생성자 호출");
	}
	
	@Override//재정의된 메소드라는 뜻.
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		return price-(int)(price*saleRatio);
	}
	public int getAgentID() {
		return agentID;
	}
	public String showCustomerInfo() {
		return super.showCustomerInfo()+" 담당 상담원 아이디는 "+agentID+ "입니다.";
	}
}
