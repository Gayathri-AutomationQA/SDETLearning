package mandatoryHomeWork.algorithms.twoPointers;

public class CW1446_ConsecutiveCharacters {
    public int maxPower(String s) {
    	
    	 int left =0;
         int right = 1;
         int windowSize = 1;

         while(right<s.length()){
             if(s.charAt(right)!=s.charAt(left)){
                 left = right;
             }
             else{
                 if(right-left+1>windowSize){
                     windowSize = right-left+1;
                 }
             }
             right++;
         }

		return 0;

}
}