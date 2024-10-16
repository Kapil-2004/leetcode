class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length ;
        int [] dp = new int [n];
        return path(cost , dp);
    }

    public int path(int []nums , int []dp){
        dp[0] = nums[0];
        dp[1] = nums[1];
        for(int i=2 ; i<dp.length ; i++){
            int first = dp[i-2];
            int sec = dp[i-1];
            dp[i] = Math.min(first , sec) + nums[i];
        }
        return Math.min(dp[dp.length-1] , dp[dp.length-2]);
    }
}