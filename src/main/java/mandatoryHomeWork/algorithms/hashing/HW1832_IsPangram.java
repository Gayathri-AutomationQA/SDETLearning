package mandatoryHomeWork.algorithms.hashing;

public class HW1832_IsPangram {

	public boolean checkIfPangram(String sentence) {
		// create 26 size array 
		// Try to add each character to correspoding index starting from 0 to 26
		// check the array if not 0
		
		//O[N] o[N]

		int[] alphaOut = new int[26];
		for(Character ch: sentence.toCharArray()){
			alphaOut[ch-'a']++;
		}
		for(int index =0;index<alphaOut.length;index++){
			if(alphaOut[index]==0) return false;
		}
		return true;
	}


}
