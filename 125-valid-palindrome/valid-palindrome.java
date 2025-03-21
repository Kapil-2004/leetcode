class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<s.length() ; i++){
            char c = s.charAt(i);
            if( (int)c >= 65 && (int)c <= 90){
                sb.append(Character.toLowerCase(c));
            }
            if((int)c >= 97 && (int)c <= 122){
                sb.append(c);
            }
            if((int)c >= 48 && (int)c <= 57){
                sb.append(c);
            }
        }
        int st = 0;
        int end = sb.length()-1;
        while(st < end){
            if(sb.charAt(st) != sb.charAt(end)) return false;
            st++;
            end--;
        }
        return true;
    }
}