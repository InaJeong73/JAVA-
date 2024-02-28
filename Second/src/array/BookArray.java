package array;

public class BookArray {
	public static void main(String[]args) {
		Book[]library=new Book[5];//바로 instance가 생성되는 게 아니라, instance 주소값을 담을 공간이 생성됨
	
		for(int i=0;i<library.length;i++) {
			System.out.println(library[i]);
		}
	}
}
