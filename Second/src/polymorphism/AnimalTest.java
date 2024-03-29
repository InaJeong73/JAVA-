package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

public class AnimalTest{
	ArrayList<Animal>animalList=new ArrayList<Animal>();
	
	public static void main(String[]args) {
		
		AnimalTest aTest=new AnimalTest();
		aTest.addAnimal();
		
		System.out.println("원래 형으로 다운 캐스팅");
		aTest.testCatsting();
	}
	public void addAnimal() {
		animalList.add(new Human());
		animalList.add(new Tiger());
		animalList.add(new Eagle());
		for(Animal animal:animalList) {
			animal.move();
		}
	}
	
	public void testCatsting() {
		for(int i=0;i<animalList.size();i++) {
			Animal ani=animalList.get(i);
			if(ani instanceof Human) {
				Human human=(Human)ani;
				human.readBook();
			}
			else if(ani instanceof Tiger) {
				Tiger tiger=(Tiger)ani;
				tiger.hunting();
			}
			else if(ani instanceof Eagle) {
				Eagle eagle=(Eagle)ani;
				eagle.flying();
			}
			else {
				System.out.println("지원되지 않는 형입니다. ");
			}
		}
	}
}
