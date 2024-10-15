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

        // PriorityQueue <HashMap.Entry<Character, Integer>> pq = new PriorityQueue<>(Collections.reverseOrder());
        // while(!pq.isEmpty()){
            
        // }

        ArrayList < HashMap.Entry <Character , Integer>> list = new ArrayList <>(map.entrySet());
        Collections.sort( list,(a,b) -> b.getValue().compareTo(a.getValue()));
        for( HashMap.Entry <Character , Integer> entry : list){
            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }

        return sb.toString();
    }
}