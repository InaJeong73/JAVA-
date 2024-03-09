package lambda;

public class TestStringConcat {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="World";
		
		StringConcat concat1=(s,v)-> System.out.println(s+","+v);
		concat1.makeString(s1, s2);
		
		StringConcatImpl concat2=new StringConcatImpl();
		concat2.makeString(s1, s2);
	}

}
