package mandatoryHomeWork.algorithms.twoPointers;

public class H2660_IsWinner {
	public int isWinner(int[] player1, int[] player2) {
		// int twoStepCounter1 = 0;
		// int twoStepCounter2 = 0;
		// int sumPlayer1 = 0;
		// int sumPlayer2 = 0;
		// int constantNumber1 = 1;
		// int constantNumber2 = 1;

		// for(int index =0 ;index<player1.length;index++){
		//     sumPlayer1 = sumPlayer1 + constantNumber1 * player1[index];
		//     sumPlayer2 = sumPlayer2 + constantNumber2 * player2[index];
		//     if(player1[index] ==10){
		//         constantNumber1 =2;
		//         twoStepCounter1 = 2;
		//     }
		//     if(player2[index] ==10){
		//         constantNumber2 =2;
		//         twoStepCounter2 = 2;
		//     }
		//     if(twoStepCounter1==0){
		//         constantNumber1 =1;
		//     }
		//     if(twoStepCounter2==0){
		//         constantNumber2 =1;
		//     }
		//   twoStepCounter1--;
		//   twoStepCounter2--;
		// }
		// return sumPlayer1 > sumPlayer2 ? 1 : (sumPlayer1 < sumPlayer2 ? 2 : 0);

		int sumPlayer1 = 0; int pointer = 0;
		int sumPlayer2 = 0; 
		int n = player1.length;
		if(n<2){
			for(int i =0 ;i<n;i++){
				sumPlayer1 += player1[i];
				sumPlayer2 += player2[i];
			}
			return sumPlayer1 > sumPlayer2 ? 1 : (sumPlayer1 < sumPlayer2 ? 2 : 0);

		}else{
			sumPlayer1 = findSum(player1);
			sumPlayer2 = findSum(player2);

		}

		return sumPlayer1 > sumPlayer2 ? 1 : (sumPlayer1 < sumPlayer2 ? 2 : 0);


	}

	public int findSum(int[] player1){
		int sumPlayer1 =0;
		int n = player1.length;
		for(int i =0 ;i<player1.length;i++){
			sumPlayer1 += player1[i];
			if( player1[i] == 10 && i < n-2 ){
				sumPlayer1 += 2*player1[i+1] + 2* player1[i+2];
				i = i+2;
			}else if(player1[i] == 10 && i < n-1 ){
				sumPlayer1 += 2*player1[i+1];
				i =i+1;
			}

		}
		return sumPlayer1;
	}

}
