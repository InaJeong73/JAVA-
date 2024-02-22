package loopexample;

public class BreakExample2{

	public static void main(String[] args) {
		int sum=0;
		int num=0;
		for(;;num++) {
			sum+=num;
			if(sum>1000)
				break;
		}
		System.out.println("num: "+num);
		System.out.println("sum: "+sum);
		
	}

}
