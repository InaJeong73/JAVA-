package classpart;

public class PersonTest {
	public static void main(String[]args) {
		Person person1=new Person();
		person1.age=40;
		person1.name="James";
		person1.married=true;
		person1.numberOfChildren=3;
		
		person1.showPersonInformation();
		
	}
}
