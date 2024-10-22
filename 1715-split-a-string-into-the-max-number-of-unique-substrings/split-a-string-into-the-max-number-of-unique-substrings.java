class Solution {
    public int maxUniqueSplit(String s) {
        HashSet<String> set = new HashSet<>();
        return path(s , set , 0);
    }
    public int path(String s , HashSet <String> set , int st){
        if(s.length()==st){
            return 0;
        }
        int max=0;
        for (int i = st+1; i <= s.length(); i++) { 
            String c = s.substring(st, i);  
            if (!set.contains(c)) {
                set.add(c);  
                max = Math.max(max , 1+path(s , set , i));
                set.remove(c);
            }
        }
        return max;
    }
}