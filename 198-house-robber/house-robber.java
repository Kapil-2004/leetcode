class Solution {
    public int rob(int[] nums) {
        int []dp = new int [nums.length+1];
        Arrays.fill(dp,-1);
        return path(nums,dp,0);
    }

    public int path(int []nums , int[]dp , int i){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int rob = nums[i]+path(nums,dp,i+2);
        int no = path(nums,dp,i+1);
        dp[i]=Math.max(rob , no);
        return dp[i];
    }
}