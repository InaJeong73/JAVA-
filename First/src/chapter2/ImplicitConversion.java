package chapter2;

public class ImplicitConversion {
	public static void main(String[]args) {
		byte bNum=10;
		int iNum=bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2=20;
		float fNum=iNum2;
		
		System.out.println(iNum2);
		System.out.println(fNum);
		
		double dNum;
		dNum= fNum+iNum;
		//더할 때 iNum이 float형으로 형변환되고, dNum에 값을 대입할 때 (fNum+iNum)이 double형으로 형변환됨
		System.out.println(dNum);
	}
}
