package classpart;

public class FunctionTest {
public static void main(String[]args) {
	int num1=20;
	int num2=10;
	
	int sum1=add(num1,num2);
	System.out.println(num1+"+"+num2+"="+sum1+"입니다.");
	
	int sum2=minus(num1,num2);
	System.out.println(num1+"-"+num2+"="+sum2+"입니다.");
	
	int sum3=Multiplication(num1,num2);
	System.out.println(num1+"*"+num2+"="+sum3+"입니다.");
	
	int sum4=division(num1,num2);
	System.out.println(num1+"/"+num2+"="+sum4+"입니다.");
}

public static int add(int n1, int n2) {
	int result;
	result=n1+n2;
	
	return result;
}

public static int minus(int n1,int n2) {
	int result;
	result=n1-n2;
	
	return result;
}

public static int Multiplication(int n1,int n2) {
	int result;
	result=n1*n2;
	
	return result;
}

public static int division(int n1,int n2) {
	int result;
	result=n1/n2;
	
	return result;
}
}
