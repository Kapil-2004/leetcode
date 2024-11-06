class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0 ; i<s.length() ; i++){
            for(int j=i ; j<s.length() ; j++){
                if(pal(s.substring(i,j+1))){
                    if(ans.length() < j-i+1){
                        ans=s.substring(i,j+1);
                    }
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