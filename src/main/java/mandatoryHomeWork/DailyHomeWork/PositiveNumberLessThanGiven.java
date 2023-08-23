package mandatoryHomeWork.DailyHomeWork;

import org.testng.annotations.Test;

public class PositiveNumberLessThanGiven {
	// Problem: Given a positive integer num, return the number of positive integers less than or
	// equal to num whose digit sums are even.

	// The digit sum of a positive integer is the sum of all its digits. (1 to 1000)
	// Example 1:

	// Input: num = 4
	// Output: 2
	// Explanation:
	// The only integers less than or equal to 4 whose digit sums are even are 2 and 4.    
	// Example 2:

	// Input: num = 30
	// Output: 14
	// Explanation:
	// The 14 integers less than or equal to 30 whose digit sums are even are
	// 2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26, and 28.

	public int positiveNumber(int n){

		int sum =0;
		int count=0;
		for (int i = 2; i <= n; i++) {
			sum = 0;
			char[] arr = String.valueOf(i).toCharArray();
			for (int j = 0; j < arr.length; j++) {
				int c = arr[j]-'0';
				sum += c;
			}
			if (sum%2==0) {
				count++;
			}
		}
		
		return count;

	}

	@Test
	public void Test1() {	
		int actual = positiveNumber(1000);
		System.out.println(actual);
	}

}
