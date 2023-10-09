package mandatoryHomeWork.DailyHomeWork;

public class HW204_CountPrimes {

	public int countPrimes(int n) {

		int counter =0;

		for(int i =2;i<n;i++){
			if(isPrime(i)){
				counter++;
			}
		}       

		return counter;
	}

	public boolean isPrime(int n){
		if(n==1) return false;
		int i =2;
		while(i<n){
			if(n%i == 0){
				return false;
			}
			i++;
		}
		return true;
	}

}
