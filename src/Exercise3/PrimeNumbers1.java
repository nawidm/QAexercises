package Exercise3;

import java.util.ArrayList;

public class PrimeNumbers1 {

	ArrayList<Integer> primes = new ArrayList<Integer>();
	
	/*public void getPrimes(int n) {
		
		primes.add(3);
		for(int i=5; i<=n;i=i+2) {
			boolean isPrime = true;
			for(int j : primes) {
			double limit = i;	
				if(i%j == 0 || j > limit) {
					isPrime = false;
					break;
				} 
				limit = i/j;
			}
			if(isPrime) {
				System.out.println(i);
				primes.add(i);
			}
		}
	}*/
	
	public int getPrimes(int n) {
		int count = 0;
		boolean isPrime;
		for(int i=5;i<=n;i=i+2) {
			isPrime = true;
			for(int j=3;j<=i/j;j=j+2) {
				if(i%j==0) {
					isPrime = false;
					break;
				} 
			}
			if(isPrime) {
				count++;
			}
		}
		return count++;
	}
	
	public static void main(String[] args) {
		PrimeNumbers1 test = new PrimeNumbers1();
		System.out.println(test.getPrimes(2000000000));
	}
}
