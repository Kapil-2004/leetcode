class Solution {
    public int characterReplacement(String s, int k) {
        int []freq = new int [26];
        int j=0 ;
        int max=0 ;
        int ans=0 ;
        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            freq[c-'A']++;
            max = Math.max(max , freq[c-'A']);
            if(i-j-max+1 > k){
                freq[s.charAt(j) -'A']-- ;
                j++;
            }
            ans = Math.max(ans , i-j+1);
        }
        return ans;
    }
}