class Solution {
   public static int rangeSum(int[] nums, int n, int left, int right) {
        int mod = (int)1e9+7;
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator< int[]>(){
            public int compare(int a[], int b[]){
                return a[0] - b[0];
            }
        });

        for(int i=0;i<n;i++){
            pq.offer(new int[] {nums[i],i});
        }
        int sum =0;
        for(int i=0;i<right;i++){
            int cur[] = pq.poll();
            if(i >=left-1){
                sum = (sum + cur[0])%mod;
            }

            if(cur[1]+1 < n){
                cur[1]++;
                cur[0]= cur[0] + nums[cur[1]];
                pq.offer(cur);
            }
        }

        return sum;

    }
}