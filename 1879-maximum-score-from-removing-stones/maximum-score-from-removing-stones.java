class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue <Integer> pq = new PriorityQueue <>(Collections.reverseOrder());
        pq.add(a);
        pq.add(b);
        pq.add(c);
        int ans=0;
        while(pq.size()>1){
            int max = pq.poll()-1;
            int max2 = pq.poll()-1;
            if(max>0){
                pq.add(max);
            }
            if(max2>0){
                pq.add(max2);
            }
            ans++;
        }
        return ans;
    }
}