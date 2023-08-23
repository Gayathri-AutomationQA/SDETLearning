package mandatoryHomeWork.foundation; //Time Taken 20 mins

public class PivotIndexRedoTimeBound {
	//https://leetcode.com/problems/find-pivot-index/description/
	
	/* 1) Did I understand the problem? - Yes

	 * 2) Test data set 
	 * 	1.Input: nums = [1,7,3,6,5,6]
		   Output: 3

	 * 	2. Input: nums = [1,2,3]
			Output: -1

	 * 3) Do I know how to solve it? -> Yes

	 * 4) Ask for hint (If you do not know how to solve) - No 
	 *
	 * 5) // Do I know alternate solutions as well? Yes

	 * 6) // If you know alternate solutions -> find out the O Notations (Performance)

	 * 7) Start always with psuedo code --> 
	 * 
		 * 	1.Iterate through for loop
		 *  2. Iterate through another for loop
		 *  3. if element is less than pivot add sum to left 
		 *  4. if greater than pivot index add sum to right 
		 *  5. skip the current index 
		 *  6. return sum ;
	 *
	 * 8) Implement them in the code (editor)
	 *
	 * 9) Test against the different data set
	 *
	 * 10) If it fails, debug them to solve it !!
	 *
	 */
    public int pivotIndex(int[] nums) {

	//[0,1,2,3,4,5]
	int sumLeft;
    int sumRight;

	for (int i = 0; i < nums.length; i++) {
        sumLeft = 0;
        sumRight = 0;
        for (int j = 0; j < nums.length; j++) {
            if(j<i) sumLeft = sumLeft + nums[j];
            else if(j>i) sumRight = sumRight + nums[j];
        }
        if(sumLeft == sumRight)
            return i;

	}
	return -1;
    }
	
}
