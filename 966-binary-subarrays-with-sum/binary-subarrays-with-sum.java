class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return path(nums,goal) - path(nums , goal-1);
    }
    public int path(int []nums , int goal){
        int sum=0 ;
        int i=0 ;
        int ans=0;
        for(int j=0 ; j<nums.length ; j++){
            sum += nums[j];
            while(sum>goal && i<=j){
                sum -= nums[i];
                i++;
            }
            ans += j-i+1;
        } 
        return ans;
    }
}