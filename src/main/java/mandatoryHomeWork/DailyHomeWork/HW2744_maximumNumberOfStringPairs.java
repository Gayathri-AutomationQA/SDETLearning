package mandatoryHomeWork.DailyHomeWork;

import java.util.HashSet;
import java.util.Set;

public class HW2744_maximumNumberOfStringPairs {
	
	public int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<String>();
        for(String word:words){
            if(!set.contains(reverse(word))){
                set.add(word);
            }
        }
        return words.length-set.size();
    }

    public String reverse(String s){
        String newStr = "";
        for(int k=s.length()-1;k>=0;k--){
           newStr += s.charAt(k)+""; 
        }
        return newStr;
    }

}
