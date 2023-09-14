package mandatoryHomeWork.DailyHomeWork;

public class HW1528_ShuffleString {
	public String restoreString(String s, int[] indices) {
    //Time complexity O[N2]
   //Space Complexity 
       int[] out = new int[s.length()];
       String outStr ="";
       for(int i=0;i<s.length();i++){
            out[indices[i]]=s.charAt(i);    
       }
       for(int i=0;i<s.length();i++){
           outStr += (char)out[i];
       
       }

   return outStr;
   }
}
