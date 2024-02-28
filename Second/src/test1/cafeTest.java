package test1;

public class cafeTest {
	public static void main(String[]args) {
		Cafe congCafe=new Cafe("콩다방");
		Cafe starCafe=new Cafe("별다방");
		
		Person personLee=new Person("이정현");
		Person personKim=new Person("김지수");
		
		Drink Americano=new Drink("아메리카노",4000);
		Drink Latte=new Drink("라테",4500);
		
		personLee.buySomeDrinks(congCafe, Latte);
		personKim.buySomeDrinks(starCafe, Americano);
		
		System.out.println(starCafe.cafeName+" 수입:"+starCafe.getProfit());
		System.out.println(congCafe.cafeName+" 수입:"+congCafe.getProfit());
		System.out.println(personLee.name+" 잔여금액:"+personLee.getMoney());
		System.out.println(personKim.name+" 잔여금액:"+personKim.getMoney());
	}
}
