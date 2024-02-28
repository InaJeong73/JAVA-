package arraylist;

import java.util.ArrayList;

public class Student {
	private static int serialNum=1000;
	public String studentName;
	public int studentNum;
	public ArrayList<Subject>subjects;
	
	public Student(String studentName) {
		subjects=new ArrayList<Subject>();
		serialNum++;
		studentNum=serialNum;
		this.studentName=studentName;
	}
	
	public void addSubject(Subject subject) {
		subjects.add(subject);
	}
	
	public int calculateTotal() {
		int sum=0;
		for(int i=0;i<subjects.size();i++) {
			sum+=subjects.get(i).getScore();
		}
		return sum;
	}
	
	public void showSubjectsScore() {
		System.out.println("학번 "+this.studentNum+"번 "+this.studentName+"의 성적표");
		for(int i=0;i<subjects.size();i++) {
			System.out.println(this.studentName+"의 "+subjects.get(i).getSubjectName()+" 과목 성적은 "+subjects.get(i).getScore()+"입니다.");
		}
		System.out.println(this.studentName+"의 총점은 "+this.calculateTotal()+"입니다.");
	}
}
