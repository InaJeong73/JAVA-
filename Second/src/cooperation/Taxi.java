package cooperation;

public class Taxi {
	String taxiNum;
	int passengerCount;
	int money;
	
	public Taxi(String taxiNum) {
		this.taxiNum= taxiNum;
	}
	
	public void take(int money) {
		this.money+=money;
		passengerCount++;
	}
	public void showInfo() {
		System.out.println(taxiNum+"번 택시의 승객은 "+passengerCount+"명이고, 수입은 "+money+"입니다. ");
	}
}
