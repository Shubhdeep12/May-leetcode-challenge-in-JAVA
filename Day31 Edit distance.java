class Solution {
       
    public int minDistance(String word1, String word2) {
        int a = word1.length();

		int b = word2.length();

		int[][] dp = new int[a + 1][b + 1];

		// Base case, make a to b
		for (int i = 0; i <= a; i++) {
			dp[i][0] = i;
		}

		for (int j = 0; j <= b; j++) {
			dp[0][j] = j;
		}
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				
				if (word1.charAt(i) == word2.charAt(j)) {
					dp[i + 1][j + 1] = dp[i][j];
				}
				else {
					int replace = dp[i][j];

					int delete = dp[i][j + 1];

					int insert = dp[i + 1][j];

					dp[i + 1][j + 1] = Math.min(replace, Math.min(delete, insert)) + 1;
				}
			}
		}
        return dp[a][b];
}
}