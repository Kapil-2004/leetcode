class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length ;
        int [] dp = new int [n];
        return path(cost , dp);
    }

    public int path(int []nums , int []dp){
        dp[0] = nums[0];
        dp[1] = nums[1];
        for(int i=2 ; i<nums.length ; i++){
            dp[i] = nums[i]+Math.min(dp[i-2] , dp[i-1]); 
        }
        return Math.min(dp[nums.length-1] , dp[nums.length-2]);
    }
}