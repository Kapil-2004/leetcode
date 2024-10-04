class Solution {
    public long maximumTotalSum(int[] nums) {
        Arrays.sort(nums);
        long sum=0;
        int pre=nums[nums.length-1];
        sum+=pre;
        if(nums.length==1){
            return pre;
        }
        for(int i=nums.length-2 ; i>=0 ; i--){
            if(pre > nums[i]){
                sum+=nums[i];
                pre=nums[i];
            }
            else{
                pre=pre-1;
                if(pre==0){
                    return -1;
                }
                sum+=pre;
            }
        } 
        return sum;
    }
}