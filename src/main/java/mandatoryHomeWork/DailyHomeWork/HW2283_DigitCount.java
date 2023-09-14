package mandatoryHomeWork.DailyHomeWork;

public class HW2283_DigitCount {
	
	 public boolean digitCount(String num) {

	        //BruteForce
	        // Iterate through the digit
	        int numberOfOccurence =0;
	        for(int i=0;i<num.length();i++){
	            numberOfOccurence = findnumberOfOccurence(num, i);
	            // System.out.println(numberOfOccurence);
	            if(numberOfOccurence != num.charAt(i)-'0'){
	                 return false;
	            }
	        }
	                    return true;

	    }

	    public int findnumberOfOccurence(String num,int i){
	        int count = 0;
	                    // System.out.println(i);

	        for(int j=0;j<num.length();j++){
	                        System.out.println(num.charAt(j));
	            if(num.charAt(j)-'0'==i){
	                count++;
	                                    System.out.println(count);

	            } 
	        }
	        return count;
	    }

}
