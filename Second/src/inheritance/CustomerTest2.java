package inheritance;

public class CustomerTest2 {
	public static void main(String[]args) {
		VIPCustomer customerKim=new VIPCustomer(100,"김유신",1);
		customerKim.bonusPoint=10000;
		//하위 클래스 객체가 생성된다.
		//상위클래스를 상속받은 하위 클래스가 생성될 때는 반드시 상위 클래스의 생성자가 먼저 호출된다.
		System.out.println(customerKim.showVIPInfo());
	}
}
