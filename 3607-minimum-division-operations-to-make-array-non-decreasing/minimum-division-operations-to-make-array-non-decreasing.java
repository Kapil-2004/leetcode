class Solution {
    public int minOperations(int[] nums) {
        int ans=0;
        for(int i=nums.length-1 ; i>0 ; i--){
            if(nums[i]<nums[i-1]){
                nums[i-1] = gpd(nums[i] , nums[i-1]);
                if(nums[i-1]==-1) return -1;
                ans++;
            }
        }
        return ans;
    }

    public int gpd(int n , int m){
        for(int i=n ; i>1 ; i--){
            if(m%i==0 ){
                return i;
            }
        }
        return -1;
    }
}