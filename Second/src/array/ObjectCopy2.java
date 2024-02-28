package array;

public class ObjectCopy2 {
	public static void main(String[]args) {
		
	Book[]bookArray1=new Book[3];
	Book[]bookArray2=new Book[3];
	
	bookArray1[0]=new Book("태백산맥","조정래");
	bookArray1[1]=new Book("데미안","헤르만 헤세");
	bookArray1[2]=new Book("어떻게 살 것인가","유시민");
	
	System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
	//bookArray1을 bookArray2에 복사할 때 bookArray2에 인스턴스기 생성되는게 아니라 bookArray1에 있는 기존 인스턴스의 주소 값이 복사되는 것이다. 
	//즉, bookArray1와 bookArray2의 각 요소가 같은 인스턴스를 가리키고 있는 것, 이를 '얕은 복사'라고 함.
	for(int i=0;i<bookArray2.length;i++) {
		bookArray2[i].showBookInfo();
	}
	
	System.out.println("===bookArray1===");
	bookArray1[0].setBookName("나목");
	bookArray1[0].setAuthor("박완서");
	for(int i=0;i<bookArray2.length;i++) {
		bookArray1[i].showBookInfo();
	}
	
	System.out.println("===bookArray2===");
	for(int i=0;i<bookArray2.length;i++) {
		bookArray2[i].showBookInfo();
	}
	}
}

