package mandatoryHomeWork.algorithms.hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Assert;
import org.testng.annotations.Test;

public class HW290_WordPattern_Solved_ToBeOptimized {
	public boolean wordPattern(String pattern, String s) {
		int length =pattern.length();
		String[] sArr = s.split(" ");
		char[] patternArr = pattern.toCharArray();
		Map<Character,String> map = new HashMap<>();
		for(int index =0 ; index < length ; index++){
			if(!map.containsKey(patternArr[index])){
				map.put(patternArr[index], sArr[index]);
			}else{
				String str =  map.get(patternArr[index]);

				System.out.println(str.getClass());
				System.out.println(sArr[index].getClass());

				if(!str.equals(sArr[index])) {
					return false;
				}
			}
		}
		
		 Set<String> set = new HashSet<>();
	        for(Map.Entry<Character,String> each : map.entrySet()){
	           if(!set.add(each.getValue())){
	               return false;
	           };
	        }
		return true;
	}
	
	@Test
	public void test1() {
		Boolean actual = wordPattern("abba",  "dog cat cat dog");
		Assert.assertTrue(actual);
	}
}
