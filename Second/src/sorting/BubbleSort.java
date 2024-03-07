package sorting;

public class BubbleSort implements Sort{

	@Override
	public void ascending(int[]arr) {
		System.out.println("QuickSort ascending");
	}

	@Override
	public void descending(int[]arr) {
		System.out.println("QuickSort descending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort입니다.");
	}

}
