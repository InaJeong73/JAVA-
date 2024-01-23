package chapter2;

public class TypeInference {
	public static void main(String[]args) {
		var i=10;
		var j=10.0;
		var str="hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str="test";
		System.out.println(str);
		//str=10;
		//var로 선언한 변수에 초기에 추론된 자료형과 다른 자료형 값을 저장할 수 없음
		//var은 지역변수에만 사용 가능
		//지역변수는 {}안에서만 사용할 수 있는 변수를 뜻함
	}
}
