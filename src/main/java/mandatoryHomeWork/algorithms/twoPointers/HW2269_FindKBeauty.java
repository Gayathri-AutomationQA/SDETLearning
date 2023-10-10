package mandatoryHomeWork.algorithms.twoPointers;

public class HW2269_FindKBeauty {

	public int divisorSubstrings(int num, int k) {

		//convert to String 

		String strNum = num + "";

		int left =0; int right = 0; int count=0; String temp = "";

		while(right<strNum.length()){
			temp += strNum.charAt(right);
			if(right-left+1 == k ){
				if(Integer.parseInt(temp)!=0 && num% Integer.parseInt(temp) == 0){
					count++;
				}
				temp = temp.substring(1);
				left++;
			}
			right++;
		}
		return count;

	}

}
