class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0) return 0;
        int ans=1 ;
        int res=1 ;
        for(int i=1 ; i<nums.length ; i++){
            if(nums[i]-nums[i-1]==1) {
                ans++;
                res = Math.max(res,ans);
            }
            else if(nums[i]==nums[i-1]) continue ;
            else{
                ans=1;
            }
        }
        return res;
    }
}