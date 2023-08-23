package mandatoryHomeWork.foundation;

import java.util.List;

import org.junit.Test;

public class DetermineColorOfChessboardSquare {
	
	 public boolean squareIsWhite(String coordinates) {

	        if((coordinates.charAt(0)-'a'+1)%2==0){

	            if((coordinates.charAt(1)-'0')%2==0){
	                return false;
	            }else{
	                return true;
	            }
	        }else{
	            if((coordinates.charAt(1)-'0')%2==0){
	                return true;
	            }else{
	                return false;
	            }
	        }
	    }
	 @Test
		public void Test2() {	
			boolean actual = squareIsWhite("a1");
			System.out.println(actual);
		}
}
