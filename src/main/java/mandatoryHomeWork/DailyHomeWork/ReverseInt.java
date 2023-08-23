package mandatoryHomeWork.DailyHomeWork;

import org.testng.annotations.Test;

public class ReverseInt {

	/*
	 * Reversing an integer means to reverse all its digits.

	For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not retained.
	Given an integer num, reverse num to get reversed1, then reverse reversed1 to get reversed2. 
	Return true if reversed2 equals num. Otherwise return false.


    // 1. Understood - Yes
    // 2.Frame Test data (valid, invalid and edge cases)
        // Input: 2021
        // Output: true

         //Input : 12300
        // output : false
      // 3.Do you know the solution or else ask for hint? Yes
    // 4.Do you have any alternate approaches? find the best appraoch? No
    // 5.Write Pseudo code in paper
        /**
        	1. Do reverse using temp mech
        	2. if leading zero - trim zeros 
        	3. reverse again 
        	3. compare given string and out
	 */
	// 6.Dry run the pseudo code with prepared Test Data
	// 7.Write the code on paper
	// 8.Check for complie time errors
	// 9.write code on IDE - Done
	// 10.Debug the code if any failures
	// 11.Optimise the code



	public boolean reverseInt(int n) {

		String strNumber = String.valueOf(n);
		System.out.println(strNumber);

		String out1 = "";
		String out2 = "";
		String out3 ;
//		System.out.println(strNumber.toCharArray().length-1);
		
		for (int i = strNumber.length()-1; i >=0; --i) {
			out1 +=strNumber.charAt(i);
			System.out.println(out1);
		}
		out1 = String.valueOf(Integer.parseInt(out1));
				


		for (int i = out1.toCharArray().length-1; i >=0; i--) {
			out2 +=out1.charAt(i);
			System.out.println(out2);
		}
		System.out.println(out2);
		return (strNumber.equals(out2))? true : false;
//		return false;

	}
	@Test
	public void Test1() {	
		boolean actual = reverseInt(12300);
		System.out.println(actual);
	}
}
