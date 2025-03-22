class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []ans = new int [2];
        HashMap <Integer , Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++){
            map.put(nums[i] , i+1);
        }
        for(int i=0 ; i<nums.length ; i++){
            if(map.containsKey(target-nums[i])){
                ans[0] = i+1;
                ans[1] = map.get(target-nums[i]);
                return ans;
            }
        }
        return ans;
    }
}