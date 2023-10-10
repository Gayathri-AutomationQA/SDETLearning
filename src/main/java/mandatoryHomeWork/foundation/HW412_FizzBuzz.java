package mandatoryHomeWork.foundation;

import java.util.ArrayList;
import java.util.List;

public class HW412_FizzBuzz {
	public List<String> fizzBuzz(int n) {

		// Pseudo Code
		/* Get n
		 *  iterate through 1 to n 
		 *  if i%3 and i%5 == FizzBuzz
		 *  else if i%5 == Buzz
		 *  else if i%3 == Fizz
		 *  else i as string
		 * return array
		 */
		List<String> list = new ArrayList<>();
		for(int i =1;i<=n;i++){
			if(i%3==0 && i%5==0) list.add("FizzBuzz");
			else if(i%3==0)  list.add("Fizz");
			else if(i%5==0)  list.add("Buzz");
			else  list.add(String.valueOf(i));
		}

		return list;

	}
}
