package mandatoryHomeWork.foundation;

public class CwStringHalvesAlike {
	public boolean halfalike(String s) {
		
		 String a = s.substring(0,s.length()/2);
			String b = s.substring(s.length()/2);
			
			a = a.replaceAll("(a|e|i|o|u|A|E|I|O|U)", "");
			b = b.replaceAll("(a|e|i|o|u|A|E|I|O|U)", "");		
			return (a.length()) == (b.length());
			
			}
		
	}
	

