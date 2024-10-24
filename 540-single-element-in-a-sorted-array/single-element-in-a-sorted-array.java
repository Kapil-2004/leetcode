class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length ;
        int st=0 ;
        int end=n-1 ;
        while(st<=end){
            int mid = st+(end-st)/2 ;
            if(mid%2==0){
                if(mid==0){
                    return nums[mid];
                }
                if(mid==n-1){
                    return nums[mid];
                }
                if(nums[mid] == nums[mid-1]){
                    end=mid-1;
                }
                else if(nums[mid] == nums[mid+1]){
                    st=mid+1 ;
                }
                else return nums[mid];
            }
            if(mid%2!=0){
                if(mid==n-1){
                    return nums[mid];
                }
                if(nums[mid] == nums[mid-1]){
                    st=mid+1;
                }
                else if(nums[mid] == nums[mid+1]){
                    end=mid-1 ;
                }
            }
        }
        return -1;
    }
}