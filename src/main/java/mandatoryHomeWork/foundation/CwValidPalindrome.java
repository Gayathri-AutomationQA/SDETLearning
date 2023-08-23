package mandatoryHomeWork.foundation;

public class CwValidPalindrome {

	public boolean isValidPalindrome(String name) {
		String name1 = name.toLowerCase().replaceAll("[^a-z0-9/g]", "");
		String out ="";
		for (int i = name1.length()-1; i >=0	; i--) {
			out =out + name1.charAt(i);
			System.out.println(out);
		}
		out = out.trim();
		return out.equals(name1) ;
	}

}
