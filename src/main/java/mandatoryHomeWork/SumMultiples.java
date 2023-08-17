package mandatoryHomeWork;

import org.junit.Test;
public class SumMultiples {
    public int sumOfMultiples(int n) {
    //Problem : https://leetcode.com/problems/sum-multiples/description/

    // 1. Understood - Yes
    // 2.Frame Test data (valid, invalid and edge cases)
        // Input: n = 7
        // Output: 21
    // 3.Do you know the solution or else ask for hint? Yes
    // 4.Do you have any alternate approaches? find the best appraoch? No
    // 5.Write Pseudo code in paper
        /**
        Create a new variable sum 
        Iterate through n and check if it is divisible by 3,5,7
        if divisible add it to summ
        else skip
        return sum
         */
    // 6.Dry run the pseudo code with prepared Test Data
    // 7.Write the code on paper
    // 8.Check for complie time errors
    // 9.write code on IDE - Done
    // 10.Debug the code if any failures
    // 11.Optimise the code
    
    int sum =0;

    for(int i = 1; i <= n; i++) {
        if(i%3 == 0 || i%5==0 || i%7==0){
            sum = sum  + i;
        }
			
	}

    return sum;

    }
     @Test
		public void Test2() {	
			int actual = sumOfMultiples(7);
			System.out.println(actual);
		}
}