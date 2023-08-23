package mandatoryHomeWork.foundation;

public class BuySellStockRedotimeBound {
	
	//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
	
	/* 1) Did I understand the problem? - Yes

	 * 2) Test data set 
	 * 	1.Input: prices = [7,1,5,3,6,4]
			Output: 5

	 * 	2. Input: prices = [7,6,4,3,1]
		Output: 0

	 * 3) Do I know how to solve it? -> Yes

	 * 4) Ask for hint (If you do not know how to solve) - No 
	 *
	 * 5) // Do I know alternate solutions as well? Yes

	 * 6) // If you know alternate solutions -> find out the O Notations (Performance)

	 * 7) Start always with psuedo code --> 
	 * 
	 * 	1.Iterate through the array and check the subtraction of the first element and other element and 
	 * 		save least positive number
	 * 	2. if the sum is -1 return 0
	 *
	 * 8) Implement them in the code (editor)
	 *
	 * 9) Test against the different data set
	 *
	 * 10) If it fails, debug them to solve it !!
	 *
	 */
	
	 public int maxProfit(int[] stockPrices) {
	        int maxProfit = 0;
			for (int i = 0; i < stockPrices.length; i++) {
				for (int j = i+1; j < stockPrices.length; j++) {

	                if(stockPrices[j]-stockPrices[i] > maxProfit) {
	                    maxProfit = stockPrices[j]-stockPrices[i];
	                                    System.out.println(maxProfit);
	                }
	            }
			}

	        return maxProfit;
			
	    }
			
}
