package mandatoryHomeWork.foundation;

public class CwAbeforeB {
	public boolean checkString(String s) {
		 //    if (s.length()!=1 && s.indexOf('b')!= -1 ) {
		// 		return s.lastIndexOf('a')  == (s.indexOf('b')-1);
		// 	}else{
	    //         return true;
	    //     }
						return s.contains("ba") ? false: true ;

	}
}
