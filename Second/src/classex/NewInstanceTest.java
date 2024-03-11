package classex;

public class NewInstanceTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		//생성자로 생성하기
		Person person1=new Person();
		System.out.println(person1);
		
		//Class클래스의 newInstance()메서드로 생성하기
		Class pClass=Class.forName("classex.Person");
		Person person2=(Person)pClass.newInstance();//Object 반환하므로 다운캐스팅 진행
		System.out.println(person2);
	}

}
