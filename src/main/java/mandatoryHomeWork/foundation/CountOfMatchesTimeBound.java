package mandatoryHomeWork.foundation; //Time Taken 20 mins

public class CountOfMatchesTimeBound {
	
	//https://leetcode.com/problems/count-of-matches-in-tournament/description/
	
	/* 1) Did I understand the problem? - Yes

	 * 2) Test data set 
	 * 	1.Input: n = 7
		  Output: 6
	 * 	2. Input: n = 14
		 Output: 13

	 * 3) Do I know how to solve it? -> Yes

	 * 4) Ask for hint (If you do not know how to solve) - No 
	 *
	 * 5) // Do I know alternate solutions as well? Yes

	 * 6) // If you know alternate solutions -> find out the O Notations (Performance)

	 * 7) Start always with psuedo code --> 
	 * 
		 * 	1. get input number
		 * 	2. if n - even , matches = n/2 = teams
		 * 		if n - odd , matches = (n-1)/2 , teams (n-1)/2 +1
		 * 	2. sum the matches played until the teams size is 0
		 * 	3. return the sum 
	 *
	 * 8) Implement them in the code (editor)
	 *
	 * 9) Test against the different data set
	 *
	 * 10) If it fails, debug them to solve it !!
	 *
	 */
	
	 public int numberOfMatches(int teams) {
		 int matches = 0;
		 while(teams!=1) { //7 //4
			 if(teams%2 ==0) {			
				matches = matches + (teams/2); //2 //1
				teams = teams/2; //2 //1
			 }else {
				 matches = matches + ((teams-1)/2); //3
				 teams = ((teams-1)/2) + 1; //4
			 }
		 }
		return matches;
		 
	 }
}
