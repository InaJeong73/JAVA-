package hiding;
//접근제어자에 대해 배워보자
public class Student {
	int studentID;
	private String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName=studentName;
	}
}
