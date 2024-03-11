package object;

public class StringTest2 {
	public static void main(String[]args) {
		String str1=new String("Java");
		String str2=new String("Android");
		
		System.out.println(str1);
		System.out.println("처음 문자열 주소 값: "+System.identityHashCode(str1));
		
		str1=str1.concat(str2);
		System.out.println(str1);
		System.out.println("연결된 문자열 주소 값: "+System.identityHashCode(str1));
	
		// 출력 결과를 통해 문자열은 불변한다는 사실과 만약 변경이 있었다면 그 변경된 결과에 해당하는 객체는 새롭게 생성된 객체임을 알 수 있다. 
	}
}
