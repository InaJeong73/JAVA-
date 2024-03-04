package abstractex;

 public abstract class Computer {
	 //추상 메서드는 메서드 구현에 대한 책임을 상속받는 클래스에 위임한다는 뜻임.
	 public abstract void display();
	 public abstract void typing();
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
