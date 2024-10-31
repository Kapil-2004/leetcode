class Solution {
    public int matrixSum(int[][] nums) {
        for(int []arr : nums){
            Arrays.sort(arr);
        }
        int ans=0;
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0 ; i<nums[0].length ; i++){
            for(int j=0 ; j<nums.length ; j++){
                pq.add(nums[j][i]);
                nums[j][i]=0;
            }
            ans += pq.poll();
            pq.clear();
        }
        return ans;
    }
}