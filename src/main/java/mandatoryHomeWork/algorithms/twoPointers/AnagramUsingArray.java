package mandatoryHomeWork.algorithms.twoPointers;

import org.testng.annotations.Test;

public class AnagramUsingArray {

	public Boolean isAnagram(String s ,String t) {
		
		if(s.length()!=t.length()) return false;

		short[] out = new short[128];
		s = s.toLowerCase();
		t = t.toLowerCase();

		for (Character ch : s.toCharArray()) {
			out[ch]++;
		}

		for (Character ch : t.toCharArray()) {
			out[ch]--;
		}

		for (int j = 0; j < out.length; j++) {
			if(out[j]!=0) {
				return false;
			}

		}
		return true;
	}


	@Test
	public void test() {
		Boolean bool = isAnagram("anagram","nagaram");
		System.out.println(bool);
	}
}
