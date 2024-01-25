package operator;

public class OperatorEx5 {
	public static void main(String[]args) {
		int num=0B00000101;//5
		System.out.println(num<<2);//00010100
		System.out.println(num>>2);//00000001
		System.out.println(num>>>2);//00000001
		
		System.out.println(num);
		
		num<<=2;
		System.out.println(num);
		
	}
}
