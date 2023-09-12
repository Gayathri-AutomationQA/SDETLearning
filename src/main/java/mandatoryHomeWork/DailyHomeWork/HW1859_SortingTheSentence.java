package mandatoryHomeWork.DailyHomeWork;

public class HW1859_SortingTheSentence {
	
	public String sortSentence(String s) {
        String[] out = null ;
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                out[s.charAt(i-1)-'0']= s.substring(j,i-2);
                j=i+1;
            }
        }
        return out.toString();
    }

}
