class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int ans=0;
        for(int i=0 ; i<n ; i++){
            int even = pal(s , i , i+1);
            int odd = pal(s , i-1 , i+1);
            ans += even + odd +1; 
        }
        return ans;
    }

    public int pal(String s , int i , int j){
        if(i<0 || j==s.length() || s.charAt(i)!=s.charAt(j)) return 0;
        return 1+pal(s , i-1 , j+1);
    }
}