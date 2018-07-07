package cracking_practice;

public class MagicIndex {

	static int magicFast(int[] array) {
		return magicFast(array, 0, array.length - 1);
	}
	
	static int magicFast(int[] array, int start, int end) {
		if (end < start) {
			return -1;
		}
		int mid = (start + end) / 2;
		if (array[mid] == mid) {
			return mid;
		} else if (array[mid] > mid) {
			return magicFast(array, start, mid - 1);
		} else {
			return magicFast(array, mid + 1, end);
		}
	}
	
	public static void main(String[] args) {
		int[] intArray = new int[]{ 0, 3, 4, 5, 6, 7, 8 };
		System.out.println(magicFast(intArray));
	}
	
}
