package mandatoryHomeWork.foundation;

import org.junit.Assert;
import org.junit.Test;

public class HwNextBiggestAlphabet {

	/* Problem Statement :
	 * Homework: 1. Given a sorted character array and a target character, find the
	 * next biggest character in the array.
	 */

	/* 
	  Input - char[] , char 
	  Output - char
	 */ 

	/*Positive - [�b�, �d� , �h�], a
	  Negative - [�b�, �d� , �h�], z
	  Edge     - [�b�, �d� , �h�], A
	 */


	/*psuedo Code:
		1. get the char[] and char 		
		2. for loop to traverse through char array
			check if the input char and char[] is a smaller case or upper case convert to smaller case
		3. if to compare the char value with the array characters*/

	public char nextBiggestAlphabet (char[] alphabets, char charTobeChecked) {
		for (int i = 0; i < alphabets.length; i++) {
			if(Character.compare(Character.toLowerCase(alphabets[i]),Character.toLowerCase(charTobeChecked))>0) {
				return alphabets[i];
			}
		}
		return charTobeChecked;
	}
	
	//Positive
		@Test
		public void Test1() {
			char actual = nextBiggestAlphabet(new char[] {'b', 'd' , 'h'}, 'a');
			Assert.assertEquals('b', actual);
		}
		//Negative
		@Test
		public void Test2() {
			char actual = nextBiggestAlphabet(new char[] {'b', 'd' , 'h'}, 'z');
			Assert.assertEquals('z', actual);
		}
		//Edge
		@Test
		public void Test3() {
			char actual = nextBiggestAlphabet(new char[] {'b', 'd' , 'h'}, 'A');
			Assert.assertEquals('b', actual);
		}
}
