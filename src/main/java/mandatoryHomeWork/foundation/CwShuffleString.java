package mandatoryHomeWork.foundation;

import java.util.Arrays;

public class CwShuffleString {
	
	public String shuffleString(String name,int[] indices)
	{
		String out = "";
		char[] outArray = new char[name.length()];
		for (int i = 0; i < indices.length; i++) {
			outArray[indices[i]] = name.charAt(i);			
		}
		for(int i = 0; i < outArray.length; i++) {
				out = out + outArray[i];
			}
			return out;
			}
}
