package mandatoryHomeWork.algorithms;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class HW438_FindAllAnagrams_SlidingWindow {
			
//		technique two Pointer
//      sliding window
	    public List<Integer> findAnagrams(String s, String p) {

	        int left = 0; 
	        int right = p.length()-1; int range =p.length();
	        List<Integer> stringList = new ArrayList<>();
	        while(right<s.length()){
	        	if(reset(left,right,p,s)!=-1) {
		            stringList.add(reset(left,right,p,s));
	        	}
	            left++;
	            right++;
	        }

	        return stringList;
	    }

	    public int reset(int start,int end,String p, String s){

	        int[] arr = new int[26];
	        int initialStart = start;
	        for(int i=start;start<=end;start++){
	            arr[s.charAt(start)-'a']++;
	        }
	        for(int i=0;i<p.length();i++){
	            arr[p.charAt(i)-'a']--;
	        }
	        for(int i =0;i<arr.length;i++){
	            if(arr[i]!=0){
	                return -1;
	            }
	        }
	        return initialStart;
	    }
	    @Test
		public void Test1() {	
			List<Integer> actual = findAnagrams("cbaebabacd",  "abc");
			System.out.println(actual);
		}

}
