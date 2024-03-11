package object;

public class StringBuilderTest {
	public static void main(String[]args) {
		String javaStr=new String("Java");
		System.out.println("javaStr의 실제 주소:"+System.identityHashCode(javaStr));
		
		StringBuilder buffer=new StringBuilder(javaStr);
		System.out.println("연산 전 buffer의 실제 주소:"+System.identityHashCode(buffer));
		buffer.append(" and ");
		buffer.append(" android ");
		buffer.append(" programming is fun ");
		
		System.out.println("연산 후 buffer의 실제 주소:"+System.identityHashCode(buffer));
		
		javaStr=buffer.toString();
		System.out.println(javaStr);
		System.out.println("javaStr의 실제 주소:"+System.identityHashCode(javaStr));
		
		
	}
}
