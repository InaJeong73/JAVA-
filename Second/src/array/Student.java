package array;

public class Student {
	private static int serialNum=1000;
	public int studentID;
	public String name;
	
	public Student(String name) {
		serialNum++;
		this.name=name;
		this.studentID=serialNum;
	}
	public void showStudentInfo() {
		System.out.println(studentID+","+name);
	}
	
}
