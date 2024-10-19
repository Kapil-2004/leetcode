class Solution {
    public boolean isNStraightHand(int[] hand, int size) {
        int n=hand.length ;
        if(hand.length % size !=0 ) return false;
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i : hand){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        while (!map.isEmpty()) {
            int i = map.firstKey();
                for (int j = i; j < i + size; j++) {
                    if (map.getOrDefault(j, 0) <= 0) {  
                        return false;
                    }
                    map.put(j , map.get(j)-1);
                    if (map.get(j) == 0) {
                    map.remove(j);  
                }
            }
        }

        return true;
    }
}