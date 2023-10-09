package mandatoryHomeWork.algorithms.twoPointers;

import org.testng.annotations.Test;

public class CW_Palindrome_InPlace {
	
	//Two pointer -- return boolean 
	//in place
	//TimeComplexity : O[N]
	//SpaceComplexity : O[1]
	
//	public boolean isPalindrome(String s) {
//		int left = 0;
//		int right = s.length()-1;
//
//		while(left<right) {
//			if(s.charAt(left)!=s.charAt(right)) {
////				if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))) { if case sensitive
//				return false;
//			}
//			right--;
//			left++;
//		}
//		return true;
//	}
	
////	expand from center
//	
//	public boolean isPalindrome(String s) {
//		s = s.toLowerCase();
//		int left =  (s.length()/2)-1;
//		int right = (s.length()%2==0)? s.length()/2 : s.length()/2+1;
//
//		while(right<s.length()) {
//			System.out.println(s.charAt(right));
//			System.out.println(s.charAt(left));
//
//			if(s.charAt(left)!=s.charAt(right)) {
//				return false;
//			}
//			right++;
//			left--;
//		}
//		return true;
//	}
	
//	find whether an integer is a palindrom
//	public boolean isPalindrome(int n) {
//		int out = 0;
//		int original =n;
//		while(n>=1) {
//			int remainder = n%10;
//			n = n/10;
//			out = out*10+remainder;
//		}
//		return out==original;
//}
	
//	Given an input String,return a boolean array by validate each of the word is a palindrome.
//			Input = "this is a Test"
//			output = [false, false, true, true]
	
	public String[] isPalindrome(String s) {
		
		String[] strArr = s.split(" ");
		int n = strArr.length;
		for(int word = 0; word<n;word++) {
			int wordLength = strArr[word].length();
			int left = (wordLength/2)-1; int right = wordLength%2==0? wordLength/2 : (wordLength/2)+1;
			while(right<n) {
				if(s.charAt(left)!=s.charAt(right))  strArr[word] = "false";
				right++;
				left--;
				break;
			}
			System.out.println(strArr[word]);
			strArr[word] = "true";
		}
		return strArr;
		
		
	}
	


	
	@Test
	public void Test1() {	
		String[] actual = isPalindrome("R");
		System.out.println("R");
		System.out.println(actual[0]);
	}
	
	@Test
	public void Test2() {	
		String[] actual = isPalindrome("RADAR");
		System.out.println("RADAR");
		System.out.println(actual[0]);
	}
	
//	@Test
//	public void Test3() {	
//		String[] actual = isPalindrome("This is the TsT");
//		System.out.println("smallletter");
//		System.out.println(actual[0]);
//	}

}
