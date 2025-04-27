class Solution {
    public String breakPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1) return "";
        StringBuilder sb = new StringBuilder(s);
        for(int i=0 ; i<s.length()/2 ; i++){
            if(s.charAt(i) != 'a'){
                sb.setCharAt(i , 'a');
                return sb.toString();
            }
        }
        if( s.charAt(s.length()-1) == 'a')  sb.setCharAt(s.length()-1 , 'b');
        return sb.toString(); 
    }
}