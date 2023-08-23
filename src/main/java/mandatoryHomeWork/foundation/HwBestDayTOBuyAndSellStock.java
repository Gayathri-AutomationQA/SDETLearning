package mandatoryHomeWork.foundation;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class HwBestDayTOBuyAndSellStock {

	/* Problem Statement :
	 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
	 */

	/* 
		  Input - int[] (Stock prices day basis) 
		  Output - int (Maximum Profit can achive)
	 */ 

	/*Positive - [7,1,5,3,6,4]
		  Negative - [7,6,4,3,1]
		  Edge     - NA
	 */


	/*psuedo Code:
			1. get the int[]  		
			2. find the lowest price 
			3. check if the index of the lowest price is less than that of highest
			    a. if yes, return the subtracted value
			    b. else, return 0
	 */
	public int maximumReturn(int[] stockPrices) {
		int[] unsortedStockPrice = Arrays.copyOf(stockPrices, stockPrices.length);
		int[] slice = null;
		Arrays.sort(stockPrices);
		int minValue = stockPrices[0];
		int maxValue = 0;
		for (int i = 0; i < unsortedStockPrice.length; i++) {
			if(unsortedStockPrice[i]==minValue) {
				slice = Arrays.copyOfRange(unsortedStockPrice, i,unsortedStockPrice.length);
			}
		}
		Arrays.sort(slice);
		maxValue = slice[slice.length-1];
		return maxValue - minValue;
	}


	//Positive
	@Test
	public void Test1() {
		int actual = maximumReturn(new int[] {7,1,5,3,6,4});
		System.out.println(actual);
		Assert.assertEquals(5, actual);
	}
	//Negative
	@Test
	public void Test2() {
		int actual = maximumReturn(new int[] {7,6,4,3,1});
		System.out.println(actual);
		Assert.assertEquals(0, actual);
	}
	//Negative
	@Test
	public void Test3() {
		int actual = maximumReturn(new int[] {7,1,1,7,7,7});
		System.out.println(actual);
		Assert.assertEquals(6, actual);
	}
}
