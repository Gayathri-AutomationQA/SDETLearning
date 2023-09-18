package mandatoryHomeWork.DailyHomeWork;

import org.testng.annotations.Test;

public class ReverseString {

	//  input = "reverse this string"
	//	output= "gnirts siht esrever"

//	 reverse a string 
	public String reverseString(String cs) {

		StringBuilder output = new StringBuilder();
	    for (int i = cs.length() - 1; i >= 0; i--) {
	        output.append(cs.charAt(i));
	    }
	    
	    System.out.println(output.toString());

	    return output.toString();
	    
	}
	
	
	
	
	@Test
	public void Test1() {	
		String actual = reverseString("");
		System.out.println(actual);
	}

}
