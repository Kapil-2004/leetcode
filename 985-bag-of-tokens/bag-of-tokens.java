class Solution {
    public int bagOfTokensScore(int[] nums, int pow) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1 ;
        int ans=0;
        int max=0;
        while(i<=j){
            if(pow >= nums[i]){
                ans++;
                pow -= nums[i];
                i++;
                max = Math.max(max , ans);
            }
            else if(ans > 0){
                ans--;
                pow += nums[j];
                j--;
            }
            else{
                break;
            }
            
        }
        return max;
    }
}