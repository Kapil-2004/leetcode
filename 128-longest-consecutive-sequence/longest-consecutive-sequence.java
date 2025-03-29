class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int ans=0;
        int max=1;
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i] == nums[i-1]) continue;
            if(nums[i] - nums[i-1] == 1) {
                max++;
            }
            else{
                ans = Math.max(max , ans);
                max=1;
            }
        }
        ans = Math.max(max , ans);
        return ans;
    }
}