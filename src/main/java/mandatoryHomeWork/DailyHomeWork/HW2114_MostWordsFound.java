package mandatoryHomeWork.DailyHomeWork;

public class HW2114_MostWordsFound {
	 public int mostWordsFound(String[] sentences) {
	        int maxNumberOfWords = 0;
	        String[]  newString ;
	        for(int i=0;i<sentences.length;i++){
	            newString = sentences[i].split(" ");
	            if(newString.length>maxNumberOfWords) maxNumberOfWords=newString.length;
	            // maxNumberOfWords = Math.max(maxNumberOfWords, sentences[i].split(" ").length); 
	            //try with indexOF as well 
	        }
	        return maxNumberOfWords;
	        
	    }
}
