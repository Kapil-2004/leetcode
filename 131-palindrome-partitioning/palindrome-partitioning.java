class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        path(s , ans , list);
        return ans;
    }

    public void path(String s , List<List<String>> ans , List<String> list ){
        if(s.length()==0){
            ans.add(new ArrayList<>(list));
            return ;
        }

        for(int i=1 ; i<=s.length() ; i++){
            if( pal(s.substring(0 , i)) ){
                list.add(s.substring(0,i));
                path(s.substring(i) , ans , list);
                list.remove(list.size()-1);
            }
        }
    }

    public boolean pal(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

}