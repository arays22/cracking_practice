package cracking_practice;

public class tripleStep {

	static int jump(int n) {
		if (n < 0) return 0;
		else if (n == 0) return 1;
		else {
			return jump(n - 1) + jump(n - 2) + jump(n - 3);
		}
}
	
	public static void main(String[] args) {
		int n = 3;
		System.out.println(jump(n));
	}
}
