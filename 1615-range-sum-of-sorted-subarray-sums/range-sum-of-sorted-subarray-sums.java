class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        PriorityQueue <Integer> pq = new PriorityQueue <>();
        for(int i=0 ; i<n ; i++){
            int sum=0;
            for(int j=i ; j<n ; j++){
                sum += nums[j];
                pq.add(sum);
            }
        }
        int ans=0;
        while(right!=0){
            if(left<=1){
                ans = (ans+pq.poll())%1_000_000_007;
            }
            else{
                pq.poll();
            }
            left--;
            right--;
        }
        return ans;
    }
}