class Solution {
    public int maxArea(int[] nums) {
        int st = 0;
        int end = nums.length-1;
        int ans = 0;
        while(st<end){
            int curr = Math.abs(st-end) * Math.min(nums[st] , nums[end]);
            ans = Math.max(ans , curr);
            if(nums[st] > nums[end]) end--;
            else st++;
        }
        return ans;
    }
}