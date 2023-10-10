package mandatoryHomeWork.algorithms.twoPointers;

public class HW2367_AruthmeticTriplets {
	public int arithmeticTriplets(int[] nums, int diff) {
		// Set<String> set = new HashSet<>();
		// int counter =0;
		// for(int i =0;i<nums.length-3+1;i++){
		//     for(int j =i+1;j<nums.length-2+1;j++){
		//         for(int k =i+2;k<nums.length;k++){
		//             System.out.println(nums[j]-nums[i] );
		//             System.out.println(nums[k]-nums[j] );
		//             if(nums[j]-nums[i]==diff && nums[k]-nums[j]==diff){
		//                 counter++;
		//             }

		//         }
		//     }
		// }
		// return counter;

		//	         int counter = 0;
		// int n = nums.length;


		int counter = 0;
		int n = nums.length;

		for (int i = 0; i < n - 2; i++) {
			int left = i + 1;
			int right = i + 2;

			while (right < n) {
				int currentDiff = nums[right] - nums[left];

				if (currentDiff == diff) {
					counter++;
					left++; // Move left pointer forward to find other triplets with the same diff
					right++; // Move right pointer forward
				} else if (currentDiff > diff) {
					left++; // If the difference is greater, move left pointer forward
				} else {
					right++; // If the difference is smaller, move right pointer forward
				}
			}
		}

		return counter;
	}
}

