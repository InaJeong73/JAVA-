package lambda;

interface PrintString{
	public void showString(String str);
}
public class TestLambda {
public static void main(String []args) {
	PrintString lambdaStr=s->System.out.println(s);
	//인스턴스형 변수에 람다식 대입
	lambdaStr.showString("hello lambda_1");
	showMyString(lambdaStr);
	//메서드의 매개변수로 람다식을 대입한 변수 전달
	
	PrintString reStr=returnString();
	reStr.showString("Hello");
}
public static void showMyString(PrintString p) {
	p.showString("hello lambda_2");
}
public static PrintString returnString() {
	return s->System.out.println(s+" World");
}
}
