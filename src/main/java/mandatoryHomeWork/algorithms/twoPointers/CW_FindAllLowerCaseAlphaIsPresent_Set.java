package mandatoryHomeWork.algorithms.twoPointers;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class CW_FindAllLowerCaseAlphaIsPresent_Set {
	public boolean lowerCase(String s) {
		
		Set<Character> set = new HashSet<>();
		
		//HashSet will be similar to HashMap KeySet similar
		// -- it uses Hash Map internally
		
		for (Character ch : s.toCharArray()) {
			if(ch!=' ') {
				set.add(ch);
			}
			
		}
			
		return set.size()==26;
//		Set code by Suresh -- Debug
//		
//		HashSet<Character> set = new HashSet<>();
//        for (char c = 0; c < s.length(); c++) {
//            set.add(c);
//        }
//        for (char c = 'a'; c < 'z'; c++) {
//            if(!set.contains(c)){
//                return false;
//            }
//        }
//        return true;
//    }

	}
	
	@Test
	public void Test() {
	boolean act = lowerCase("abadkhaalhfksagfk");
		System.out.println(act);
	}
	@Test
	public void Test2() {
	boolean act = lowerCase("abcdefghijklmnopqrstuvwxyz");
		System.out.println(act);
	}
}
