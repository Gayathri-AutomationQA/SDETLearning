package mandatoryHomeWork.algorithmsTwoPointers;

import org.testng.annotations.Test;

public class SlidingWindow_MinimumDifference {


	private int mimumDifference() {

//		int pointer = 0,sum = 0;
//		int currentMinSum= Integer.MAX_VALUE;
//		while(pointer < k) {
//			sum -= arr[pointer++];
//		}
//
//		while(pointer< arr.length) {
//			currentMinSum = Math.min(sum, currentMinSum);
//			sum -= arr[pointer-k]-arr[pointer];
//			pointer++;
//		}
//
//		return currentMinSum;
		
		
		int a = Integer.MAX_VALUE,b = Integer.MAX_VALUE;
		int c = a+b;
		
		return c;

	}
	@Test
	public void Test1() {	
		int actual = mimumDifference();
		System.out.println(actual);
	}
}
