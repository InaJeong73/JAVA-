package stream;

public class TravelCustomer {
	private String name;
	private int age;
	private int price;
	public TravelCustomer(String name,int age) {
		this.name=name;
		this.age=age;
		if(age>=15) this.price=100;
		else this.price=50;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		return "name: "+name+"age: "+age+"price: "+price;
	}
	
}
