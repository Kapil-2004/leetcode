class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList <>();
        StringBuilder sb = new StringBuilder();
        path(sb , ans , 0 , 0 , n);
        return ans;
    }
    public void path( StringBuilder sb ,List<String> ans, int o, int c, int n){
        if(o==n && c==n){
            ans.add(sb.toString());
            return;
        }
        if(o<n){
            path( sb.append('(') , ans, o+1, c, n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(c<o){
            path(sb.append(')') , ans, o, c+1, n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}