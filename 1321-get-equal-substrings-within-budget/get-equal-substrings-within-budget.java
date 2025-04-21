class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int cost=0;
        int i=0 ;
        int ans = 0;
        for(int j=0 ; j<t.length() ; j++){
            cost += Math.abs(s.charAt(j) - t.charAt(j));
            while(cost > maxCost){
                cost -= Math.abs(s.charAt(i) - t.charAt(i));
                i++;
            }
            ans = Math.max(ans , j-i+1);
        }
        return ans;
    }
}