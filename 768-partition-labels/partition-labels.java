class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap <Character ,Integer> map = new HashMap <>();
        int idx=0;
        for(int i=0 ; i<s.length() ; i++){
            map.put(s.charAt(i) , i);
        }

        ArrayList <Integer> ans = new ArrayList <>();
        int i=0 ;
        int end=0;
        for(int j=0 ; j<s.length() ; j++){
            end = Math.max(end , map.get(s.charAt(j)));
            if(j==end){
                ans.add(j-i+1);
                i=j+1;
            } 
        }
        return ans;
    }
}