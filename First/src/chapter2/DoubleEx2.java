package chapter2;

public class DoubleEx2 {
	public static void main(String[]args) {
		double dnum=1;
		
		for(int i=0;i<10000;i++) {
			dnum= dnum+0.1;
		}
		System.out.println(dnum);
	}
	//직접 계산해보면 1001이 나와야 하지만 1001.000000000159이 나옴
	//이는 컴퓨터에서 실수를 표현할 때 밑수를 2로 하기 때문에 0을 나타낼 수 없음.-> 계산 중 오차가 발생할 수 있다. 
}
