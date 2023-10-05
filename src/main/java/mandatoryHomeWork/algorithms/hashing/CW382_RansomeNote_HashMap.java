package mandatoryHomeWork.algorithms.hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class CW382_RansomeNote_HashMap {

	public boolean canConstruct(String ransomNote, String magazine) {

		Map<Character,Integer> map = new HashMap<>();


		for (char ch : ransomNote.toCharArray()) {
			
			if(map.containsKey(ch)) {
				int count = map.get(ch)+1;
				map.remove(ch);
				map.put(ch, count);
			}else {
				map.put(ch, 1);
			}
		}
		
		for (char ch : magazine.toCharArray()) {
			
			if(map.containsKey(ch)) {
				int count = map.get(ch)-1;
				map.remove(ch);
				map.put(ch, count);
			}
		}
		
		for (Map.Entry<Character, Integer> set :
            map.entrySet()) {
				if(set.getValue()>0) {
					return false;
				}
       }
		return true;


	}
	
	@Test
	public void test() {
		Boolean bool = canConstruct("bg","efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj");
		System.out.println(bool);
	}
	
	@Test
	public void test2() {
		Boolean bool = canConstruct("aa","ab");
		System.out.println(bool);
	}


}
