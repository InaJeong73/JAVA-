package staticex;

public class StudentTest6 {
	public static void main(String[]args) {
		Student3 studentLee=new Student3();
		studentLee.setStudentName("이지원");
		System.out.println(studentLee.getStudentName()+"학생의 학번: "+studentLee.studentID);
		System.out.println(studentLee.getStudentName()+"학생의 카드번호: "+studentLee.cardNum);
		
		Student3 studentSon=new Student3();
		studentLee.setStudentName("손수경");
		System.out.println(studentSon.getStudentName()+"학생의 학번: "+studentSon.studentID);
		System.out.println(studentSon.getStudentName()+"학생의 카드번호: "+studentSon.cardNum);
	}
}
