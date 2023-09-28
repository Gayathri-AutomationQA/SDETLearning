package mandatoryHomeWork.algorithms;

public class HW2562_FindArrayConcValue {
	
	public long findTheArrayConcVal(int[] nums) {
		
		//Time Complexity O[N]
		//Space Complexity O[N]

        int left = 0; int right = nums.length-1;
        String out = "";
        long sum = 0;
        while(left<=right){
            if(left !=  right) {
                out = nums[left] +""+nums[right];
            }else{
                out = nums[left]+"";
            }
            sum += Integer.parseInt(out);
            right--;
            left++;
        }
        
        String s;
//        s.indexOf
        return sum;
    }

}
