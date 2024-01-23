package chapter2;

public class Chapter2_finalEx {
	public static void main(String[]args) {
		int iNum=10;
		double fNum=2.0;
		
		double dnum1=iNum+fNum;
		double dnum2=iNum-fNum;
		double dnum3=iNum*fNum;
		double dnum4=iNum/fNum;
		
		System.out.println("실수형 연산");
		System.out.println("덧셈:"+dnum1);
		System.out.println("뺄셈:"+dnum2);
		System.out.println("곱셈:"+dnum3);
		System.out.println("나눗셈:"+dnum4);
		
		int inum1=(int)(iNum+fNum);
		int inum2=(int)(iNum-fNum);
		int inum3=(int)(iNum*fNum);
		int inum4=(int)(iNum/fNum);
		System.out.println();
		System.out.println();
		System.out.println("정수형 연산");
		System.out.println("덧셈:"+inum1);
		System.out.println("뺄셈:"+inum2);
		System.out.println("곱셈:"+inum3);
		System.out.println("나눗셈:"+inum4);
		
	}
}
