class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int i=0 ;
        int odd=0;
        int ans=0;
        int even=0;
        for(int j=0 ; j<nums.length ; j++){
            if(nums[j]%2 == 1) {
                odd++;
                even = 0;
            }
            while(odd > k){
                if(nums[i]%2 ==1 ) odd--;
                i++;
            }
            if(odd == k) {
                int temp = i;
                even=0;
                while (temp < j && nums[temp] % 2 == 0) {
                    even++;
                    temp++;
                }
                ans += even +1;
            }
        }
        return ans;
    }
}