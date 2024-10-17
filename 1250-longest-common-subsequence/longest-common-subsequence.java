class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        return lcs(text1, text2);
    }

    public int lcs(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int f = dp[i - 1][j];
                    int s = dp[i][j - 1];
                    dp[i][j] = Math.max(f , s);
                }
            }
        }
        return dp[dp.length -1][dp[0].length -1];
    }
}
