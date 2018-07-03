package cracking_practice;

public class fibonacci_sequences {

	static int fibonacci(int n) {
		if (n == 0) return 0;
		int a = 0;
		int b = 1;
		for (int i = 2; i < n; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		return a + b;
		
	}
	
	public static void main(String[] args) {
		int n = 9;
		System.out.println(fibonacci(n));
	}
	
}
