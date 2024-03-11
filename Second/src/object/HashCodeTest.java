package object;

public class HashCodeTest {
public static void main(String[]args) {
	//논리적으로 같으면 해시코드값도 동일하게 지정된다. 
	String str1=new String("abc");
	String str2=new String("abc");
	
	System.out.println(str1.hashCode());
	System.out.println(str2.hashCode());
	
	Integer i1=new Integer(100);
	Integer i2=new Integer(100);
	
	System.out.println(i1.hashCode());
	System.out.println(i2.hashCode());
}
}
