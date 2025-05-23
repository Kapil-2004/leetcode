class Solution {
    public int candy(int[] nums) {
        int n = nums.length;
        int []left = new int [n];
        int []right = new int [n];
        Arrays.fill(left , 1);
        Arrays.fill(right , 1);
        for(int i=1 ; i<n ; i++){
            if(nums[i] > nums[i-1]){
                left[i] = left[i-1]+1;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }
        int ans=0;
        for(int i=0 ; i<n ; i++){
            ans += Math.max(left[i] , right[i]);
        }
        return ans;
    }
}