package cracking_practice;

import java.util.Arrays;

public class tripleStep {

	static int countWays(int n) {
		int[] memo = new int[n + 1];
		Arrays.fill(memo, -1);
		return countWays(n, memo);
	}
	
	static int countWays(int n, int[] memo) {
		if (n < 0) {
			return 0;
		} else if (n == 0) {
			return 1;
		} else if (memo[n] > -1) {
			return memo[n];
		} else {
			memo[n] = countWays(n - 1, memo) + countWays(n - 2, memo) + countWays(n - 3, memo);
		}
		return memo[n];
	}
	public static void main(String[] args) {
		int n = 3;
		System.out.println(countWays(n));
	}
}
