package test1;

public class Drink {
	public String drinkName;
	private int drinkPrice;
	
	public Drink(String name, int price) {
		drinkName=name;
		drinkPrice=price;
	}

	public int getDrinkPrice() {
		return drinkPrice;
	}

	public void setDrinkPrice(int drinkPrice) {
		this.drinkPrice = drinkPrice;
	}
	
}
