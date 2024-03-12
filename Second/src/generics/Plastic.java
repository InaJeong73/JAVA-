package generics;

public class Plastic extends Material{
	public void doPrinting() {
		System.out.println("Plastics 재료를 출력합니다.");
	}

	@Override
	public String toString() {
		
		return "재료는 Plastics 입니다.";
	}
}
