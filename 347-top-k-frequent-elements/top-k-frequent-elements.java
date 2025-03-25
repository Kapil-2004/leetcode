class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue <Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> b.getValue() - a.getValue()
        );
        pq.addAll(map.entrySet());
        int []ans = new int [k];
        int i=0;
        while(i<k){
            ans[i] = pq.poll().getKey();
            i++;
        }
        return ans;
    }
}