package arraylist;

public class SubjectTest {
	public static void main(String[]args) {
		Student studentLee=new Student("이정현");
		Student studentKim=new Student("김지수");
		
		studentLee.addSubject(new Subject("국어",100));
		studentLee.addSubject(new Subject("수학",50));
		
		studentKim.addSubject(new Subject("국어",70));
		studentKim.addSubject(new Subject("수학",85));
		studentKim.addSubject(new Subject("영어",100));
		
		studentLee.showSubjectsScore();
		System.out.println("================================");
		studentKim.showSubjectsScore();
	}
}
