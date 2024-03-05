package interfaceex;

public interface Calc {
	double PI=3.14;
	int ERROR=-999999;
	//interface에서 선언한 변수는 컴파일 과정에서 상수를 변환됨
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	int square(int num);
	//interface에서 선언한 메서드는 컴파일 과정에서 추상 메서드로 변환됨.
}
