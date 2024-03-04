package abstractex;

public class ComputerTest {
	public static void main(String[]args) {
		//Computer c1=new Computer();
		//추상 클래스로는 인스턴스 생성이 불가능하다. 
		Computer c2=new DeskTop();
		//Computer c3=new NoteBook();
		Computer c4=new MyNoteBook();
	}
}
