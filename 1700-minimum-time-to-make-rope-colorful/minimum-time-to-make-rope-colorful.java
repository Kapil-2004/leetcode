class Solution {
    public int minCost(String s, int[] nums) {
        int ans=0;
        for(int i=1 ; i<nums.length ; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                ans += Math.min(nums[i] , nums[i-1]);
                nums[i] = Math.max(nums[i], nums[i-1]);
            }
        }
        return ans;
    }
}