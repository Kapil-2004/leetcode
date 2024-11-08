class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        
        int sum = nums[0];
        int ans = sum;
        
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            ans = Math.max(sum, ans);
        }
        
        return ans;
    }
}
