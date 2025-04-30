class Solution {
    public int maxProfit(int[] nums) {
        int buy = nums[0];
        int ans=0;
        for(int i:nums){
            if(i>buy){
                ans += i-buy;
            }
            buy = i;
        }
        return ans;
    }
}