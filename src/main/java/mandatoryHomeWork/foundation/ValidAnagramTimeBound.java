package mandatoryHomeWork.foundation;

public class ValidAnagramTimeBound {

	//https://leetcode.com/problems/valid-anagram/

	/* 1) Did I understand the problem? - Yes

	 * 2) Test data set 
	 * 	1. Input: s = "anagram", t = "nagaram"
			Output: true
	 * 	2. Input: s = "rat", t = "car"
			Output: false

	 * 3) Do I know how to solve it? -> Yes

	 * 4) Ask for hint (If you do not know how to solve) - No 
	 *
	 * 5) // Do I know alternate solutions as well? Yes

	 * 6) // If you know alternate solutions -> find out the O Notations (Performance)

	 * 7) Start always with psuedo code --> 
	 * 
	 * 	1. String function to 
	 *
	 * 8) Implement them in the code (editor)
	 *
	 * 9) Test against the different data set
	 *
	 * 10) If it fails, debug them to solve it !!
	 *
	 */

	public boolean isAnagram(String s, String t) {

		/* Approach 1
		 * int countCharT =0; int countCharS =0; String sNew = s; String tNew = t;
		 * if(s.length()==t.length()) { for (int i = 0; i < s.length(); i++) { s = sNew;
		 * t = tNew; countCharT = t.replaceAll(String.valueOf(s.charAt(i)),
		 * "").length(); countCharS = s.replaceAll(String.valueOf(s.charAt(i)),
		 * "").length(); if(countCharS!=countCharT) { return false; } } }else { return
		 * false; }
		 */
		// Approach 2:

		char[] out1 = new char[127];
		char[] out2 = new char[127];;
		for (char c : s.toCharArray()) {
			out1[c-'0']++;
		}
		for (char c : t.toCharArray()) {
			out2[c-'0']++;
		}

		for (int i = 0; i < out1.length; i++) {
			if(out1[i]!=out2[i]) {
				return false;
			}

		}

		return true;
	}

}
