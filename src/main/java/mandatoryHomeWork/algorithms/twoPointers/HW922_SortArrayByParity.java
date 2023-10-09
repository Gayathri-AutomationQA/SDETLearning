package mandatoryHomeWork.algorithms.twoPointers;

public class HW922_SortArrayByParity {
	 public int[] sortArrayByParityII(int[] nums) {

	        int even = 0; int odd = 1; 
	        int length = nums.length; 

	        while(even<length && odd< length){
	            if(nums[even]%2==0) even +=2;
	            if(nums[odd]%2!=0) odd +=2;
	            if(even < length && odd < length && nums[even]%2!=0 && nums[odd]%2 == 0){
	                int temp = nums[even];
	                nums[even] = nums[odd];
	                nums[odd] = temp;
	            }
	        }
	        return nums;
	    }

}
