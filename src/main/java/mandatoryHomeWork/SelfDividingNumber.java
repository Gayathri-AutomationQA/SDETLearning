package mandatoryHomeWork;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {   

    public List<Integer> selfDividingNumbers(int left, int right) {
    //Problem - https://leetcode.com/problems/self-dividing-numbers/

    // 1. Understood - Yes
    // 2.Frame Test data (valid, invalid and edge cases)
        // Input: left = 1, right = 22
        // Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
    // 3.Do you know the solution or else ask for hint? Yes
    // 4.Do you have any alternate approaches? find the best appraoch? No
    // 5.Write Pseudo code in paper
        /**
        Create a new variable sum 
        Iterate through left to right 
        Split the number into characters and divide the whole number by digit
            if divisible add in an array
            else skip
        return array
         */
    // 6.Dry run the pseudo code with prepared Test Data
    // 7.Write the code on paper
    // 8.Check for complie time errors
    // 9.write code on IDE - Done
    // 10.Debug the code if any failures
    // 11.Optimise the code
    List<Integer> list = new ArrayList<Integer>();  
    for (int i = left; i <= right; i++) {
            boolean divisibleFlag = true;

       char[] newI =  String.valueOf(i).toCharArray();
       for (int j = 0; j < newI.length; j++) {
                  System.out.println(newI[j]-'0');
            if((newI[j]-'0')!=0){
                if(i%(newI[j]-'0')!=0){
                    divisibleFlag=false;
                }
            }else{
                divisibleFlag=false;
            }
        
           
       }
       if(divisibleFlag==true) list.add(i);
    }
		return list;
    }
}