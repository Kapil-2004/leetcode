class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        // return path(nums,goal) - path(nums , goal-1);
        int sum=0;
        int ans=0;
        HashMap <Integer , Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0 ; i<nums.length ; i++){
            sum += nums[i];
            if(map.containsKey(sum - goal)){
                ans += map.get(sum-goal);
            }
            map.put(sum , map.getOrDefault(sum , 0)+1);
        }
        return ans;
    }
    // public int path(int []nums , int goal){
    //     int sum=0 ;
    //     int i=0 ;
    //     int ans=0;
    //     for(int j=0 ; j<nums.length ; j++){
    //         sum += nums[j];
    //         while(sum>goal && i<=j){
    //             sum -= nums[i];
    //             i++;
    //         }
    //         ans += j-i+1;
    //     } 
    //     return ans;
    // }
}