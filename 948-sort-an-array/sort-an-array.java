class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(int i=0 ; i<nums.length ; i++){
            pq.add(nums[i]);
        }
        int []ans = new int [nums.length];
        for(int i=0 ; i<nums.length ; i++){
            ans[i]=pq.poll();
        }
        return ans;
    }
}