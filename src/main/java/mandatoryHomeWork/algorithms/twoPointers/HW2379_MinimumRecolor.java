package mandatoryHomeWork.algorithms.twoPointers;

public class HW2379_MinimumRecolor {

	public int minimumRecolors(String blocks, int k) {
		int start = 0;
		int end = 0;
		int charWCount = 0;
		int minCount = Integer.MAX_VALUE;
		String output = "";

		// First, count 'W's in the initial window of size 'k'
		while (start < k) {
			if (blocks.charAt(start) == 'W') {
				charWCount++;
				output += blocks.charAt(start);
			}
			start++;
		}

		minCount = charWCount;

		// Reset start to 0
		start = 0;

		// Now, move the window and update charWCount
		while (end < blocks.length() - 1) {
			if (blocks.charAt(start) == 'W') {
				charWCount--;
			}
			start++;
			end++;

			if (blocks.charAt(end) == 'W') {
				charWCount++;
			}

			minCount = Math.min(minCount, charWCount);
		}

		// Calculate the minimum number of recolors needed
		int recolorsNeeded = k - minCount;

		return recolorsNeeded < 0 ? 0 : recolorsNeeded;
	}

}
