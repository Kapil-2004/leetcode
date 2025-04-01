class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> ans = new ArrayList <>();
    gen(ans, "", 0, 0, n);
    return ans;
    }
    public void gen(List<String> ans, String s, int o, int c, int n){
        if(o==n && c==n){
            ans.add(s);
            return;
        }
        if(o<n){
            gen(ans, s+'(', o+1, c, n);
        }
        if(c<o){
            gen(ans, s+')', o, c+1, n);
        }
    }
}