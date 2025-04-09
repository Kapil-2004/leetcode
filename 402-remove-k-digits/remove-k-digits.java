class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() == k) return "0";
        Stack <Character> st = new Stack <>();
        for(int i=0 ; i<num.length() ; i++){
            while(!st.isEmpty() && k>0 && st.peek() > num.charAt(i)){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        for(char c : st){
            if(sb.length()==0 && c=='0') continue;
            sb.append(c);
        }
        if(sb.length() == 0) return "0";
        return sb.toString();
    }
}