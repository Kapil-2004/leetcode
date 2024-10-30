class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap <String , Integer> map = new HashMap<>();
        for(String s : words){
            map.put( s , map.getOrDefault(s , 0)+1);
        }

        PriorityQueue < HashMap.Entry<String, Integer> > pq = new PriorityQueue <>(
            (a, b) -> {
                if (a.getValue().equals(b.getValue())) {
                    return a.getKey().compareTo(b.getKey()); 
                }
                return b.getValue() - a.getValue(); 
            }
        );

        for (HashMap.Entry<String, Integer> set : map.entrySet()) {
            pq.add(set);
        }

        ArrayList<String> ans = new ArrayList <>();
        while(k>0){
            ans.add(pq.poll().getKey());
            k--;
        }
        return ans;
    }
}