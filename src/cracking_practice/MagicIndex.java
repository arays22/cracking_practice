package cracking_practice;

public class MagicIndex {

	static int magicFast(int[] array) {
		return magicFast(array, 0, array.length - 1);
	}
	
	static int magicFast(int[] array, int start, int end) {
		if (end < start) {
			return -1;
		}
		int midIndex = (start + end) / 2;
		int midValue = array[midIndex];
		if (midValue == midIndex) {
			return midIndex;
		}
		
		int leftIndex = Math.min(midIndex - 1, midValue);
		int left = magicFast(array, start, leftIndex);
		if (left >= 0) {
			return left;
		}
		
		int rightIndex = Math.max(midIndex + 1, midValue);
		int right = magicFast(array, rightIndex, end);
		
		return right;
	}
	
	
	public static void main(String[] args) {
		int[] intArray = new int[]{ 0, 3, 4, 5, 6, 7, 8 };
		System.out.println(magicFast(intArray));
	}
	
}
