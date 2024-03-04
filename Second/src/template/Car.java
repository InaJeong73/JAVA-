package template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//자동차가 달리는 방법을 순서대로 구현함.
	final public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
	}
}
