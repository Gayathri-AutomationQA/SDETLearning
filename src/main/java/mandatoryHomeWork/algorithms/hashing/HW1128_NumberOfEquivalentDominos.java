package mandatoryHomeWork.algorithms.hashing;

import java.util.HashMap;
import java.util.Map;

public class HW1128_NumberOfEquivalentDominos {
	public int numEquivDominoPairs(int[][] dominoes) {
		// Map<String,String> map = new HashMap<>();
		int count =0;
		for(int i = 0; i<dominoes.length;i++){
			Map<String,String> map = new HashMap<>();
			String strOut = Math.min(dominoes[i][0],dominoes[i][1])+ ""+Math.max(dominoes[i][0],dominoes[i][1]);
			System.out.println("==="+strOut);

			map.put(strOut,"");
			for(int j = i+1; j<dominoes.length;j++){

				String strOut1 = Math.min(dominoes[j][0],dominoes[j][1])+ ""+Math.max(dominoes[j][0],dominoes[j][1]);

				System.out.println(strOut1);
				if(map.containsKey(strOut1)) {
					count++;
				}

			}
		}
		return count;
	}

}
