class Solution {
    public int possibleStringCount(String s) {
        int ans=1;
        char c = s.charAt(0);
        for(int i=1 ; i<s.length() ; i++){
            if(s.charAt(i) == c){
                ans++;
            }
            else{
                c = s.charAt(i);
            }
        }
        return ans;
    }
}