class Solution {
    public int minStoneSum(int[] piles, int k) {
        int ans=0;
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0 ; i<piles.length ; i++){
            pq.add(piles[i]);
        }
        while( k>0 && !pq.isEmpty()){
            int n = pq.poll();
            pq.add((n+1)/2);
            k--;
        }

        while(!pq.isEmpty()){
            ans+=pq.poll();
        }

        return ans;
    }
}