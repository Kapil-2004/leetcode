class Solution {
    public long maxKelements(int[] nums, int k) {
        long ans=0;
        PriorityQueue <Integer> pq = new PriorityQueue <>(Collections.reverseOrder());
        for(int i=0 ; i<nums.length ; i++){
            pq.add(nums[i]);
        }
        while(k>0){
            int n= pq.poll();
            ans += n;
            n = (int)Math.ceil(n/3.0);
            pq.add(n);
            k--;
        }
        return ans;
    }
}