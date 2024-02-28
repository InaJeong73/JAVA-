package test1;

public class Person {
	public String name;
	private int money=10000;
	
	public Person(String name) {
		this.name=name;
	}
	public void buySomeDrinks(Cafe cafe,Drink drink) {
		cafe.sell(drink.getDrinkPrice());
		money-=drink.getDrinkPrice();
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}
