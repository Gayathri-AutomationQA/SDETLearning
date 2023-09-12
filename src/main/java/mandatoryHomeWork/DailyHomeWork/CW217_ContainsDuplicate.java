package mandatoryHomeWork.DailyHomeWork;

public class CW217_ContainsDuplicate {
	
	    public boolean containsDuplicate(int[] nums) {

		// 		for(int i=0;i<nums.length;i++)
		// 		{	
		// 		for(int j=i+1;j<nums.length;j++){
		// 			if(nums[i] == nums[j])
		// 			{
		// 				return true;	
		// 			}
		// 		}
		// 	}

		// return false;

			int j = nums.length-1;
	    	for(int i=0;i<(nums.length)/2;i++)
				{	
					System.out.println(nums[i]);
					System.out.println(nums[j]);
					if(nums[i] == nums[j])
					{
						return true;	
					}
				j--;
				}
		
	        return false;


			// Set<Integer> check = new HashSet<Integer>();
			// 	for(int i=0;i<nums.length;i++){
			// 		if(check.contains(nums[i])){
			// 			return true;
			// 		}else{
			// 				check.add(nums[i]);
			// 		}
						
			// 	}
			// 	 return false;
	    }
	}


