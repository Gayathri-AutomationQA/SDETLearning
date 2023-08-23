package mandatoryHomeWork.DailyHomeWork;

import org.testng.annotations.Test;

public class SetMismatch {
    /*  https://leetcode.com/problems/set-mismatch/
    //    You have a set of integers s, which originally contains all the numbers from 1 to n.
    //   Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.
    //    You are given an integer array nums representing the data status of this set after the error.
    //    Find the number that occurs twice and the number that is missing and return them in the form of an array.
     */
    // 1. Understood - Yes
    // 2.Frame Test data (valid, invalid and edge cases)
    //       Example 1:
    //
    //        Input: nums = [1,2,2,4]
    //        Output: [2,3]
    //        Example 2:
    //
    //        Input: nums = [1,1]
    //        Output: [1,2]
      // 3.Do you know the solution or else ask for hint? Yes
    // 4.Do you have any alternate approaches? find the best appraoch? No
    // 5.Write Pseudo code in paper
        /**
        	1. iterate 1 to n
        	2. Check for contains of i
        	3. 
        	3.
	 */
    // 6.Dry run the pseudo code with prepared Test Data
    // 7.Write the code on paper
    // 8.Check for complie time errors
    // 9.write code on IDE - Done
    // 10.Debug the code if any failures
    // 11.Optimise the code

    public int[] findErrorNums(int[] nums) {
        int[] out = new int[10000];
        int[] outFinal = new int[2];
        for (int i = 0; i < nums.length ; i++) {
            out[nums[i]]++;
        }
        for (int i = 0; i < out.length; i++) {
            if(out[i]==0){
                outFinal[0]=i;
            }
            if(out[i]==2){
                outFinal[1]=i;
            }
        }

        return outFinal;
    }
    @Test
    public void Test1() {
        int[] actual = findErrorNums(new int[] {1,2,2,4});
        System.out.println(actual[0]);
        System.out.println(actual[1]);
    }
    @Test
    public void Test2() {
        int[] actual = findErrorNums(new int[] {1,1});
        System.out.println(actual[0]);
        System.out.println(actual[1]);
    }
}
