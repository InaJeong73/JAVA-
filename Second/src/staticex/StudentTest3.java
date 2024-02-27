package staticex;

public class StudentTest3 {
	public static void main(String[]args) {
		Student1 studentLee=new Student1();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.getStudentName());
		System.out.println(studentLee.studentName+"학번:"+Student1.serialNum);
		
		Student1 studentSon=new Student1();
		studentSon.setStudentName("손수경");
		System.out.println(studentSon.getStudentName());
		System.out.println(studentSon.studentName+"학번:"+Student1.serialNum);
	}
}