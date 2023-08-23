package mandatoryHomeWork.foundation;

public class CwLengthOfLastWord {
	public int lengthOfLastWord(String s) {
		
//		Approach 1 :
		s = s.trim();
		int count = 0;
		for (int i =s.length()-1 ; i >=0; i--) {
			if(s.charAt(i)!= ' ') {
				count++; 
			}else {
				break;
			}
			
		}
		return count;
		
//		Approach 2 :

//		return s.trim().length()-s.trim().lastIndexOf(' ')-1;

	}
}
