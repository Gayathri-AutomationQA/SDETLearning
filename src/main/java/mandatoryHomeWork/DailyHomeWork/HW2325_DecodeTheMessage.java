package mandatoryHomeWork.DailyHomeWork;

import java.util.HashMap;
import java.util.Map;

public class HW2325_DecodeTheMessage {
	
	public String decodeMessage(String key, String message) {
	       Map<Character,Character> map = new HashMap<>();  
	       String output ="";
	       key= key.replaceAll(" ","");
	        char alpha = 'a';
	        for(int i =0;i<key.length();i++){
	            if(!map.containsKey(key.charAt(i))){
	                 map.put(key.charAt(i),alpha) ;
	                 alpha++;
	            }
	        }
	        for(int j =0;j<message.length();j++){
	           output += message.charAt(j) == ' '?" ":map.get(message.charAt(j));
	        }
	        return output;
	    }

}
