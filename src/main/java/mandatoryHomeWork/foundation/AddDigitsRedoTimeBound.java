package mandatoryHomeWork.foundation;

public class AddDigitsRedoTimeBound {
	//	https://leetcode.com/problems/add-digits/description/

	/* 1) Did I understand the problem? - Yes

	 * 2) Test data set 
	 * 	1. 38 - 11 ->2
	 * 	2. 0 -- > 0

	 * 3) Do I know how to solve it? -> Yes

	 * 4) Ask for hint (If you do not know how to solve) - No 
	 *
	 * 5) // Do I know alternate solutions as well? Yes

	 * 6) // If you know alternate solutions -> find out the O Notations (Performance)

	 * 7) Start always with psuedo code --> 
	 * 
	 * 	1. convert int to String and char array 
	 * 	2. Iterate through and add the values 
	 * 	3. Create output variable , int out
	 * 	4. return the sum 
	 *
	 * 8) Implement them in the code (editor)
	 *
	 * 9) Test against the different data set
	 *
	 * 10) If it fails, debug them to solve it !!
	 *
	 */


	public int addDigits(int num) {
		while(num>9) {
			char[] charNum = String.valueOf(num).toCharArray();
			num = 0;
			for (char c : charNum) {
				num = num + (c-'0');
			}
		}

		return num;
	}


}