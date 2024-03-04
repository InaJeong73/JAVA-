package test;

public abstract class PlayerLevel {
	abstract public void run();
	abstract public void jump();
	abstract public void turn();
	abstract public void showLevelInfo();
	
	public void go(int count) {
		run();
		for(int i=0;i<count;i++) {
			jump();
		}
		turn();
	}
}

class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("jump 할 줄 모르지롱");
		
	}

	@Override
	public void turn() {
		System.out.println("turn할 줄 모르지롱");
		
	}

	@Override
	public void showLevelInfo() {
		System.out.println("*****초급자 레벨입니다.*****");
		
	}
	
}

class AdvancedLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("높이 jump합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("turn할 줄 모르지롱");
		
	}

	@Override
	public void showLevelInfo() {
		System.out.println("*****중급자 레벨입니다.*****");
		
	}
	
}

class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
		
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 jump합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("한 바퀴 돕니다.");
		
	}

	@Override
	public void showLevelInfo() {
		System.out.println("*****고급자 레벨입니다.*****");
		
	}
	
}