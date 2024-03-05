package chapter9;

public abstract class Car {
	public abstract void start() ;
	public abstract void drive() ;
	public abstract void stop() ;
	public abstract void turnOff() ;
	public void washCar() {
		System.out.println("세차를 합니다.");
	}
	final public void run() {
		start();
		drive();
		stop() ;
		turnOff() ;
		washCar();
	}
	
}

class Sonata extends Car{
	@Override
	public void start() {
		System.out.println("Sonata 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Sonata 달립니다.");		
	}

	@Override
	public void stop() {
		System.out.println("Sonata 멈춥니다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("Sonata 시동을 끕니다.");		
	}
	
}
class Avante extends Car{
	@Override
	public void start() {
		System.out.println("Avante 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Avante 달립니다.");		
	}

	@Override
	public void stop() {
		System.out.println("Avante 멈춥니다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("Avante 시동을 끕니다.");	

}
}

class Grandeur extends Car{

	@Override
	public void start() {
		System.out.println("Grandeur 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Grandeur 달립니다.");		
	}

	@Override
	public void stop() {
		System.out.println("Grandeur 멈춥니다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("Grandeur 시동을 끕니다.");	
}
}

class Genesis extends Car{

	@Override
	public void start() {
		System.out.println("Genesis 시동을 켭니다.");
	}

	@Override
	public void drive() {
		System.out.println("Genesis 달립니다.");		
	}

	@Override
	public void stop() {
		System.out.println("Genesis 멈춥니다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("Genesis 시동을 끕니다.");	
	}
}