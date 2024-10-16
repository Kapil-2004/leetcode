class Solution {
    public int rob(int[] nums) {
        int []dp= new int [nums.length];
        Arrays.fill(dp , -1);
        return path(nums , 0 , dp);

    }

    public int path(int []nums , int i , int []dp){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int rob = nums[i] + path(nums , i+2 , dp);
        int dont = path(nums , i+1 , dp);
        dp[i] = Math.max(rob , dont);
        return dp[i];
    }
}