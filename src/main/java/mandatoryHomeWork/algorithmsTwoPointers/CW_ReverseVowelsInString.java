package mandatoryHomeWork.algorithmsTwoPointers;

import org.testng.annotations.Test;

public class CW_ReverseVowelsInString {

	@Test
	public void Test2() {	
		String actual = reverseVowels("hello");
		System.out.println(actual);
	}

	public String reverseVowels(String s) {

		//		if length is 1 no calculation
		//		Have two pointers i and j
		//		i in front ,j in last 
		//		if char at i is vowel increment i
		//		if char at j is vowel increment j
		//		if count = 2 swap and reset count 

	        char[] out = s.toCharArray();
			int left = 0, right = s.length()-1;
			char temp = ' ';

			if(s.length()==1) return s;

			while(left<right) {
				if(!isVowel(s.charAt(left))) {
					left++;
				}
				if(!isVowel(s.charAt(right))) {
					out[right] = s.charAt(right);
					right--;
				}

				if(isVowel(s.charAt(left)) && isVowel(s.charAt(right))) {
					temp = s.charAt(left);
					out[left] = s.charAt(right);
					out[right] = temp;
					left++;
					right--;
				}
			}

			return new String(out);
	    }
	    private boolean isVowel(char charAt) {

			if(charAt == 'a' || charAt == 'e' || charAt == 'i' ||charAt == 'o' || charAt == 'u' ||
					charAt == 'A' || charAt == 'E' || charAt== 'I' || charAt == 'O' || charAt== 'U') {
				return true;
			}
			return false;

		}

}
