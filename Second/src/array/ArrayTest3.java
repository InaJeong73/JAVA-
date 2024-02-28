
package array;

public class ArrayTest3 {
	public static void main(String[]args) {
		double[]data=new double[5];
		int size=0;
		data[0]=10.0;size++;
		data[1]=20.0;size++;
		data[2]=30.0;size++;
		
		for(int i=0;i<size;i++) {
			System.out.println(data[i]);
		}
	}
	}
		//정수와 실수 배열을 별도로 초기화하지 않고 선언하면 0으로 초기화됌
	
