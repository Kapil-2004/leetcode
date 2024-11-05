class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length==1) return stones[0];
        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i:stones){
            pq.add(i);
        }
        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            if(a-b!=0) pq.add(a-b);
        }
        if(pq.isEmpty()) return 0;
        return pq.poll();
    }
}