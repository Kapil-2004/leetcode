class Solution {
    public int minTaps(int n, int[] ranges) {
        int[] maxReach = new int[n + 1];
        
        // Step 1: Convert each tap into a left-right interval and mark maxReach
        for (int i = 0; i <= n; i++) {
            int left = Math.max(0, i - ranges[i]);
            int right = Math.min(n, i + ranges[i]);
            maxReach[left] = Math.max(maxReach[left], right);
        }

        int end = 0;
        int ans = 0;
        int max = 0;
        for(int i=0 ; i<maxReach.length ; i++){
            if(i>max) return -1;
            if(i>end){
                end = max;
                ans++;
            }
            max = Math.max(max , maxReach[i]);
        }
        return ans;
    }
}