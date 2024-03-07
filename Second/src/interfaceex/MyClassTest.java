package interfaceex;

public class MyClassTest {
	public static void main(String[]args) {
		MyClass mClass=new MyClass();
		// 생성한 클래스는 상위 인터페이스형으로 변환 가능
		X xClass=mClass;
		xClass.x();
		
		Y yClass=mClass;
		yClass.y();
		
		MyInterface iClass=mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
		
	}
}
