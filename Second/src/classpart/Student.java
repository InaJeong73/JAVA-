package classpart;

public class Student {
	//class: 예약어
	//멤버 변수=속성,특성
	int studentID;
	String studentName;
	int grade;
	String address;

	
	public void showStudentInfo() {
		System.out.println(studentName+","+address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		studentName=name;
	}
}
