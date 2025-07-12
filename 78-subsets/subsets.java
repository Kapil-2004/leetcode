class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList <>();
        List<Integer> list = new ArrayList<>();

        path(nums , ans , list , 0);
        return ans;
    }

    public void path(int[] nums , List<List<Integer>> ans , List<Integer> list , int st){
        ans.add(new ArrayList<>(list));
        for(int i=st ; i<nums.length ; i++){
            list.add(nums[i]);
            path(nums , ans , list , i+1);
            list.remove(list.size()-1);
        }
    }
}