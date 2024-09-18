package studio3;

import java.util.ArrayList;
import java.util.List;

public class Sieve {

	public static List <Integer> sieve (int a) {
		boolean [] isPrime = new boolean[n + 1]
		for (int i=2; i<=n; i++) {
				isPrime[i] = true;
			for (int p = 2; p * p <= n; p++) {
				if (isPrime[p]) {
					for (int multiple = p * p; multiple <= n; multiple += p) {
						isPrime[multiple] = false;
					}
				}
			}
		}
	}
}

public static void main(String[] args) {


}

}
