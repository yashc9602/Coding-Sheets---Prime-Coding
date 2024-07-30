// Java program to find
// sum of primes in
// range from 1 to n.
import java.io.*;
import java.util.*;

class PRIME {
	
	// Returns sum of primes
	// in range from
	// 1 to n.
	static int sumOfPrimes(int n)
	{
		// Array to store prime numbers
		boolean prime[]=new boolean[n + 1];
	
		// Create a boolean array "prime[0..n]"
		// and initialize all entries it as true.
		// A value in prime[i] will finally be
		// false if i is Not a prime, else true.
		Arrays.fill(prime, true);
	
		for (int p = 2; p * p <= n; p++) {
	
			// If prime[p] is not changed, then
			// it is a prime
			if (prime[p] == true) {
	
				// Update all multiples of p
				for (int i = p * 2; i <= n; i += p)
					prime[i] = false;
			}
		}
	
		// Return sum of primes generated through
		// Sieve.
		int sum = 0;
		for (int i = 2; i <= n; i++)
			if (prime[i])
				sum += i;
		return sum;
	}

// Driver code
	public static void main(String args[])
	{
		int n = 11;
		System.out.print(sumOfPrimes(n));
	}
}


