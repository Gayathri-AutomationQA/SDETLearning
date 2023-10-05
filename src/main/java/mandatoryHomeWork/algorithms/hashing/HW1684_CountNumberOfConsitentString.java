package mandatoryHomeWork.algorithms.hashing;

import java.util.HashSet;
import java.util.Set;

public class HW1684_CountNumberOfConsitentString {
	
	public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        int count =0;
        for(Character ch : allowed.toCharArray()){
            set.add(ch);
        }
        for(String str : words){
            boolean flag = true;
            for(Character ch : str.toCharArray()){
                if(!set.contains(ch)) flag = false;
            }
            if(flag == true) count++;
        }
        return count;
    }

}
