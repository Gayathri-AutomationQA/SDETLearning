package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class IfPrimeNmber {

	//	4. Check if the given number is prime or not 
	//	(Hint: A number is prime if it divisible only by 1 and itself)
	//	Example1: input = 5
	//			output = true
	//	Example2: input = 6
	//			output = false

	//	psuedo code:
	//	1.get the number n and divide it by 1 to n
	//	2. if divisible by others not a prime
	//	3. if divisible by n , is prime
	
	public boolean isPrime(int n) {
		if(n<=1) {
		return false;
		}
		for (int i = 2; i < n-1; i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}

	//Positive
	@Test
	public void Test1() {
		boolean actual = isPrime(11);
		System.out.println(actual);
		Assert.assertEquals(true, actual);
	}

	//Negative
	@Test
	public void Test2() {
		boolean actual = isPrime(10);
		System.out.println(actual);
		Assert.assertEquals(false, actual);
	}

	//Negative
	@Test
	public void Test3() {
		boolean actual = isPrime(0);
		System.out.println(actual);
		Assert.assertEquals(false, actual);
	}

}
