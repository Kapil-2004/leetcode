class Solution {
    public int maxScore(int[] nums, int k) {
        int lsum = 0;
        for(int i=0 ; i<k ; i++){
            lsum += nums[i];
        }
        int ans = lsum;
        int j=nums.length-1;
        int rsum=0;
        for(int i=k-1 ; i>=0 ; i--){
            lsum -= nums[i];
            rsum += nums[j--];
            ans = Math.max(ans , lsum + rsum);
        }

        return ans;
    }
}