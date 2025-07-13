class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        path(n , ans , 0 , 0 , "");
        return ans;
    }

    public void path(int n , List<String> ans , int op , int cl , String s){
        if(op == n && cl == n){
            ans.add(s);
        }
        if(op > n || cl > n || cl>op) return ;
        path(n , ans , op+1 , cl , s+"(");
        path(n , ans , op , cl+1 , s+")");
    }
}