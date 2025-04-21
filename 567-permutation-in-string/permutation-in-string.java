class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap <Character , Integer> map = new HashMap<>();
        HashSet <Character> set = new HashSet<>();
        int n = s1.length();
        for(int i=0 ; i<n ; i++){
            char c = s1.charAt(i);
            map.put(c , map.getOrDefault(c , 0)+1);
            set.add(c);
        }
        int i=0 ;
        HashMap<Character, Integer> win = new HashMap<>();

        for(int j=0 ; j<s2.length() ; j++){
            if(set.contains(s2.charAt(j))){
                win.put(s2.charAt(j) , win.getOrDefault(s2.charAt(j) , 0)+1 );
            }
            if(j-i+1 > n){
                if(set.contains(s2.charAt(i))){
                    win.put(s2.charAt(i) , win.get(s2.charAt(i))-1 );
                    if(win.get(s2.charAt(i)) == 0){
                        win.remove(s2.charAt(i));
                    }
                }
                i++;
            }

            if(j-i+1 == n && win.equals(map)) return true;
        }

        return false;
    }
}