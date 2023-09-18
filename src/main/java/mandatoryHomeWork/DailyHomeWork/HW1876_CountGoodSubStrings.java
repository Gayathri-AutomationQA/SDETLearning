package mandatoryHomeWork.DailyHomeWork;

import java.util.HashSet;
import java.util.Set;

public class HW1876_CountGoodSubStrings {

	//Pseudocode and 11 step approach in Notepad hhandwritten
	//Time Complexity : o[N*k] 
			//if length is 100 , 3 is relatively small so O[N]
	//Space Complexity : o[N * k] 
			//since string is converted to array of input length 

	public int countGoodSubstrings(String s) {

		int left = 0,right =3 ,k = 3,count =0;
		while(left<s.length()-k+1){
			System.out.println(s.substring(left,right));
			System.out.println(!isContainsDuplicate(s.substring(left,right)));
			if(!isContainsDuplicate(s.substring(left,right))) count++;
			left++;
			right++;
		}

		return count;

	}
	private boolean isContainsDuplicate(String s2){
		Set<Character> duplicate = new HashSet<>();

		for(char ch : s2.toCharArray()){
			if(duplicate.contains(ch)){
				return true;
			}
			duplicate.add(ch);
		}
		return false;
	}

}
