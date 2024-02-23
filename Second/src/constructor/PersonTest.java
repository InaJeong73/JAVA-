package constructor;

public class PersonTest {
	public static void main(String[]args) {
		Person personKim=new Person();
		personKim.height=180;
		personKim.name="김승준";
		personKim.weight=72;
		
		Person personJeong=new Person("정인아",163,53);
	}
}
