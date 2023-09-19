package mandatoryHomeWork.algorithms;

import org.testng.annotations.Test;

public class ReverseString_TwoPointers {

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



	public String reverseString(String strNumber) {

//		String out1 = "";
//		
//		
//		for (int i = strNumber.length()-1; i >=0; --i) {
//			out1 +=strNumber.charAt(i);
//			System.out.println(out1);
//		}
//
//		return out1;
		
//		Two Pointers
		int left = 0;
		int right = strNumber.length()-1;
		char[] strNumberArr = strNumber.toCharArray();
		char temp =' ';
		while(left<right) {
			temp = strNumberArr[left];
			strNumberArr[left]= strNumberArr[right];
			strNumberArr[right] = temp;
			right--;
			left++;
		}
		System.out.println(new String(strNumberArr));

		return new String(strNumberArr);

	}
	@Test
	public void Test1() {	
		String actual = reverseString("myNames");
		System.out.println(actual);
	}
}
