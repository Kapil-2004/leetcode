class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int[]arr = new int [k];
        int m=k-1 , j=n , l=k;
        while(l>0){
            arr[m]=nums[j-1];
            l--;
            m--;
            j--;
        }
        j=n-1;
        for(int i=n-k-1 ; i>=0 ; i--){
            nums[j]=nums[i];
            j--;
        }
        for(int i=0 ; i<k ; i++){
            nums[i]=arr[i];
        }
    }
}