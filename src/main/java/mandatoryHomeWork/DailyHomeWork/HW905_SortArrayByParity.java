package mandatoryHomeWork.DailyHomeWork;

public class HW905_SortArrayByParity {
	    public int[] sortArrayByParity(int[] nums) {
	    	
	    	//11 steps followed hand written note

	        //Algo/technique : Two Pointer
	        //can be done in place
	    	
	    	//TimeComplexity : O[N] , 1 loop
	    	//Space Complexity : O[N] , Array size 
	        int left = 0 ; int right = nums.length-1;

	        while(left<right){
	            while(nums[left]%2==1 && nums[right]%2==0){
	                //swap 
	                int temp = nums[left];
	                nums[left] = nums[right];
	                nums[right] = temp;
	                right--;
	                left++;
	            }
	            while(nums[left]%2==0){
	                right--;
	            }
	             while(nums[right]%2==1){
	                left++;
	            }
	        }
	    return nums;
	        
	    }
	}