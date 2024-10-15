class Solution {
    public String frequencySort(String s) {
        HashMap <Character , Integer> map = new HashMap <>();
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c , map.get(c)+1);
            }
            else{
                map.put(c , 1);
            }
        }

        PriorityQueue <HashMap.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());
        while(!pq.isEmpty()){
            HashMap.Entry<Character , Integer> entry = pq.poll();
            char ch = entry.getKey();
            int freq = entry.getValue();

            // Append the character 'freq' times to the StringBuilder
            for (int i = 0; i < freq; i++) {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}