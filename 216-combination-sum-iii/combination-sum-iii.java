class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        path(k , n , ans , list , 1 , 0);
        return ans;
    }

    public void path(int k , int n , List<List<Integer>> ans , List<Integer> list , int st , int sum){
        if(list.size() == k && sum == n){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=st ; i<10 ; i++){
            list.add(i);
            path(k , n , ans , list , i+1 , sum + i);
            list.remove(list.size()-1);
        }
    }
}