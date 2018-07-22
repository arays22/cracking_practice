package cracking_practice;

public class findPrimeFactors {

	static boolean findPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	static void primeFactors(int n) {
		for (int i = 1; i < n; i++) {
			if (findPrime(i)) {
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		primeFactors(11);
	}
}
