package mandatoryHomeWork.foundation;

public class PowerOfThree {
	public boolean isPowerOfThree(int n) {
		if(n<3 && n!=1){
			return false;
		}
		while(n>=2) { //6
			if(n%3==0) { 
				n=n/3; //2
			}else{
				return false;
			}
		}
		return true;
	}

}
