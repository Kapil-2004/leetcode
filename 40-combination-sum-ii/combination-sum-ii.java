class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        path(ans , list , nums , target , 0 , 0);
        return ans; 
    }

    public void path( List<List<Integer>> ans , List<Integer> list , int[] nums, int target , int sum , int st ){
        if(sum == target){
            if(!ans.contains(list)) ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=st ; i<nums.length ; i++){
            if(i>st && nums[i] == nums[i-1]) continue;
            if(sum + nums[i] <= target){
                list.add(nums[i]);
                path(ans , list , nums , target , sum+nums[i] , i+1 );
                list.remove(list.size()-1);
            }
        }
    }
}