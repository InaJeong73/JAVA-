package thisex;

public class CallAnotherConst {
	public static void main(String[]args) {
		Person noName=new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p=noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
		//동일한 주소값이 출력될 것임.
	}
}

class Person{
	String name;
	int age;
	
	Person(){
		this("이름없음",1);
	}
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	Person returnItSelf() {
		return this; //자신의 주소값 반환
	}
}
