class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums , k) - helper(nums,k-1);
    }
    public int helper(int nums[] , int k ){
        int i=0;
        int ans=0;
        HashMap <Integer , Integer> map = new HashMap <>();
        for(int j=0 ; j<nums.length ; j++){
            map.put(nums[j] , map.getOrDefault(nums[j] , 0) +1);
            while(map.size() > k){
                map.put(nums[i] , map.get(nums[i])-1);
                if(map.get(nums[i]) ==0) {
                    map.remove(nums[i]);
                }
                i++;
            }
            if(map.size()<=k){
                ans +=j-i+1;
            }
        }
        return ans;
    }
}