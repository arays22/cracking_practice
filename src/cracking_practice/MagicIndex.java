package cracking_practice;

public class MagicIndex {

	static int findMagicIndex(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int target = array[i];
			if (target == i) return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] intArray = new int[]{ 0, 3, 4, 5, 6, 7, 8 };
		System.out.println(findMagicIndex(intArray));
	}
	
}
