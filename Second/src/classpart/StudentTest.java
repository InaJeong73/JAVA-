package classpart;

public class StudentTest {
public static void main(String[]args) {
	Student student1=new Student();
	student1.studentName="안연수";
	System.out.println(student1.getStudentName());
	System.out.println(student1);//해시 코드(=참조값) 출력, 해시 코드는 JVM에서 객체가 생성되었을 때 생성된 객체에 할당하는 가상주소값
	
	Student student2=new Student();
	student2.studentName="안승연";
	System.out.println(student2.getStudentName());
	System.out.println(student2);
	
	//student1, student2는 참조변수. 참조변수는 힙 메모리에 생겅된 인스턴스를 말함
	//new 예약어를 통해 인스턴스를 위한 메모리 공간(힙 메모리)이 할당됌. 즉 new 예약어를 통해 생성자를 호출하면 실제로 사용할 수 있는 클래스인 인스턴스를 생성할 수 있음.
	//student1, student2는 지역변수이므로 스택메모리에 할당되고, student1, student2내에 정의되는 정보들은 힙 메모리에 저장된다. 
}
}
