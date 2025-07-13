class Solution {
    public List<List<Integer>> combinationSum(int[] num, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        path(num , target  , list , ans , 0  , 0);

        return ans;
        
    }

    public void path(int[] num, int target , List<Integer> list , List<List<Integer>> ans , int sum , int st){
        if(sum == target){
            ans.add(new ArrayList<>(list));
            return ;
        }
        
        for(int i=st ; i<num.length ; i++){
            if(sum + num[i] <= target){
                list.add(num[i]);
                path(num , target , list , ans , sum+num[i] , i);
                list.remove(list.size()-1);
            }
            
        }
    }
}