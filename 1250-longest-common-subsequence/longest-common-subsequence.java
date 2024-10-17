class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int [][]dp = new int [text1.length()+1][text2.length()+1];
        for(int []a : dp){
            Arrays.fill(a , -1);
        }
        return lcs(text1 , text2 , dp , 0 , 0);

    }

    public int lcs(String s1 , String s2 , int [][]dp , int i , int j){
        if(i==s1.length() || j==s2.length()){
            return 0;
        }

        if(dp[i][j] !=-1){
            return dp[i][j];
        }

        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans = 1+ lcs(s1 , s2 , dp ,i+1 , j+1 );
        }
        else{
            int f = lcs(s1 , s2 , dp , i+1 , j );
            int s = lcs(s1 , s2 , dp , i , j+1);
            ans = Math.max(f,s);
        }
        return dp[i][j] = ans;
    }
}