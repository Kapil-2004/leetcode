class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0] , nums[1]);
        return Math.max(path(0 , nums.length-2 , nums) , path(1 , nums.length-1 , nums));
    }
    public int path(int st , int end , int []nums){
        int n=end-st+1;
        int []dp = new int [n];
        dp[0] = nums[st];
        if(n>1) dp[1] = Math.max(nums[st] , nums[st+1]);
        for(int i=st+2 ; i<=end ; i++){
            dp[i-st]=Math.max(nums[i]+dp[i-st-2] , dp[i-st-1]);
        }
        return dp[dp.length-1];
    }
}