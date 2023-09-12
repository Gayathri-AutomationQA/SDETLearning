package mandatoryHomeWork.DailyHomeWork;

import java.awt.List;
import java.util.ArrayList;

public class HW228_SummaryRanges {
	
	public ArrayList<Object> summaryRanges(int[] nums) {
        /*
        *pseudo code
        * Iterate through 0 to nums.length
        * if i+1 != nums[i] 
        *String = 
        *
        */

        int j =0;
        String newStr= " ";
        ArrayList<Object> lsOut = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==j){
                newStr = newStr+i;
                System.out.println(newStr);
            }else{
                lsOut.add(newStr);
                newStr="";
                j--;
            }
            j++;
        }
        return lsOut;
	}

}
