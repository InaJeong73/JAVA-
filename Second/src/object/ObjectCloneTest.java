package object;
class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x=x;
		this.y=y;
		
	}

	@Override
	public String toString() {
		return "x ="+x+", y ="+y;
	}
	
}

class Circle implements Cloneable{
	Point point;
	int radius;
	
	public Circle(int x,int y, int radius) {
		point=new Point(x,y);
		this.radius=radius;
	}

	@Override
	public String toString() {
		return "원점은 "+this.point+ " 이고, 반지름은 "+radius+"cm 입니다.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


	
	
	
}
public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle=new Circle(10,20,30);
		Circle copyCircle=(Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));

	}

}
