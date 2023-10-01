package mandatoryHomeWork.algorithms;

import org.testng.annotations.Test;

public class CW382_RansomeNote_ASCII {

	public boolean canConstruct(String ransomNote, String magazine) {
		
		int[] out = new int[26];
		
		if(ransomNote.length()>magazine.length()) return false;
		
		for (char ch: ransomNote.toCharArray()) {
			out[ch-'a']++;
		}
		
		for (char ch: magazine.toCharArray()) {
			System.out.println(ch);
			System.out.println(ransomNote.contains(ch+""));
			if(ransomNote.contains(ch+"")) {
				out[ch-'a']--;
			}
		}
		
		for (int i = 0; i < out.length; i++) {
			if(out[i]>0) {
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

}
