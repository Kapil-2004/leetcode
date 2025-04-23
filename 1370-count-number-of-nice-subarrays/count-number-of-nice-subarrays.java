class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int odd=0;
        int prevCount=0;
        int i=0;
        int ans=0;
        for(int j=0 ; j<nums.length ; j++){
            if(nums[j] %2 == 1){
                odd++;
                prevCount=0;
            }

            while(odd == k){
                prevCount++;
                if(i<=j && nums[i]%2==1){
                    odd--;
                }
                i++;
            }

            ans += prevCount;
        }
        return ans;
    }
}