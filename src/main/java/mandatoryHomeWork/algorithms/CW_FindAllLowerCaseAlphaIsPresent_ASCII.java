package mandatoryHomeWork.algorithms;
import org.testng.annotations.Test;

public class CW_FindAllLowerCaseAlphaIsPresent_ASCII {
	public boolean lowerCase(String s) {
		
		boolean[] out = new boolean[26];
		
		for (char ch : s.toCharArray()) {
			if(ch == ' ') {
				
			}else {
				out[ch-'a']= true;
			}
			
		}
		for (int i = 0; i < out.length; i++) {
			if(out[i]!=true) {
				return false;
			}
			
		}
		return true;

	}
	
	@Test
	public void Test() {
	boolean act = lowerCase("abadkhaalhfksagfk");
		System.out.println(act);
	}
	@Test
	public void Test2() {
	boolean act = lowerCase("abcdefghijklmnopqrstuvwxyz ");
		System.out.println(act);
	}
}
