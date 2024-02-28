package test1;

public class Cafe {
	public String cafeName;
	private int profit=0;
	
	public Cafe(String cafeName) {
		this.cafeName=cafeName;
	}
	public void sell(int price) {
		profit=+price;
	}
	public int getProfit() {
		return profit;
	}
	public void setProfit(int profit) {
		this.profit = profit;
	}
	
}
