package array;

public class TwoDimensionPractice {
	public static void main(String[]args) {
		char[][]arr=new char[13][2];
		char ch='a';
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=ch;
				ch++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
