package hiding;

public class StudentTest {
	public static void main(String[]args) {
		Student studentLee=new Student();
		//studentLee.studentName="이상원";->오류발생함. 
		//왜냐하면 Student 클래스의 studentName 변수의 접근제어자가 private이고, private일 경우 다른 클래스의 접근이 허용되지 않기 때문이다.
		//이처럼 클래스 내부에서 사용할 변수나 메소드는 private으로 선언해서 외부에서 접근하지 못하도록 하는 것을 '정보 은닉'이라고 한다. 
		studentLee.setStudentName("이상원");
		
		System.out.println(studentLee.getStudentName());
	}
}
