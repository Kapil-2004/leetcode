class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap < Integer ,Integer > map = new HashMap <>();
        for(int i=0 ; i<matches.length ; i++){
            if(map.containsKey(matches[i][1])){
                map.put( matches[i][1] , map.get(matches[i][1])+1);
            }
            else{
                map.put(matches[i][1] , 1);
            }
        }
        List<Integer> l1 = new ArrayList <>();
        List<Integer> l2 = new ArrayList <>();
        List<List<Integer>> ans = new ArrayList <>();

        for(int i : map.keySet()){ 
            if(map.get(i) == 1){
                l2.add(i);
            }
        }
        for(int i=0 ; i<matches.length ; i++){
            if(!map.containsKey(matches[i][0]) ){
                l1.add(matches[i][0]);
                map.put(matches[i][0] , 0);
            }
        }
        Collections.sort(l1);
        Collections.sort(l2);
        ans.add(l1);
        ans.add(l2);
        return ans;
    }
}
