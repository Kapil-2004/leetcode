class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int i=0;
        int i_max=0;
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
                i_max=i;
            }
            if(map.size()==k){
                while(map.get(nums[i]) >1){
                    map.put(nums[i] , map.get(nums[i])-1);
                    if(map.get(nums[i]) ==0) {
                        map.remove(nums[i]);
                    }
                    i++;
                }
                ans += i-i_max+1;
            }
        }
        return ans;
    }
}