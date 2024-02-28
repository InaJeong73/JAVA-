package singleton;

public class Company {
	private static Company instance=new Company();//유일하게 생성한 인스턴스
	private Company() {}// 1. 생성자를 private으로 선언하여 외부에서 인스턴스를 생성할 수 없게함
	//생성자를 private으로 선언했기 때문에 내부에 생성된 유일한 인스턴스 외에는 더 이상 인스턴스를 생성할 수 없다. 
	
	public static Company getInstance() {
		if(instance==null) {
			instance=new Company();
		}
		return instance;
	}
}
