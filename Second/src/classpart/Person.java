package classpart;

public class Person {
	int age;  //나이
	String name; //이름
	boolean married;  //혼인 여부
	int numberOfChildren;//자녀수

	public void showPersonInformation() {
		System.out.println(age);
		System.out.println(name);
		System.out.println(married);
		System.out.println(numberOfChildren);
	}
}
