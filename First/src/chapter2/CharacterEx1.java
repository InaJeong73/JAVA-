package chapter2;

public class CharacterEx1 {
	public static void main(String[]args) {
		char ch1='Z';//변수에 문자 그대로 저장되는게 아니라 아스키 코드로 저장됌
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2=38;
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		int ch3=97;
		System.out.println((char)ch3);
		System.out.println(ch3);
		
		//인코딩: 문자를 아스키코드로 변환하는 일
		//아스키코드는 영문,숫자,특수문자만 표현(1바이트)
		//유니코드는 전세계의 모든 문자,숫자,특수문자를 표현 (2바이트)->유니코드의 한바이트는 아스키코드 값과 호환됌
		//Z를 인코딩하면 90, & 연산자를 인코딩하면 38, a를 인코딩하면 97
	}
}
