class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int pro = 1;
        int i=0 ; 
        int j=0 ;
        int ans=0;
        while(j<nums.length){
            pro *= nums[j];
            while(i<=j && pro >= k ){
                pro = pro/nums[i];
                i++;
            }
            ans += j-i+1;
            j++;
        }
        return ans;
    }
}