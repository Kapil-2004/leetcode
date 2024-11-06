class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int len = 1;
        String ans = s.substring(0, 1);

        for(int i=0 ; i<s.length() ; i++){
            for(int j=i+len ; j<=s.length() ; j++){
                if(j - i >len && pal(s.substring(i, j))){
                    len = j-i;
                    ans = s.substring(i, j);
                }
            }
        }
        return ans;
    }

    public boolean pal(String s ){
        int i=0 ; 
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}