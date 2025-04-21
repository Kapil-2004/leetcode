class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int totalOnes = 0;
        int maxOnes=0 ;
        int currOnes=0 ;
        for(int i :nums){
            if(i==1) totalOnes++;
        }
        int []arr = new int [nums.length*2];
        for(int i=0 ; i<n ; i++){
            arr[i] = nums[i];
            arr[i+n] = nums[i];
        }
        int i=0 ;
        for(int j=0 ; j<arr.length ; j++){
            if(arr[j] ==1 ) currOnes++;
            if(j-i+1 > totalOnes){
                if(arr[i] == 1) currOnes--;
                i++;
            }
            maxOnes = Math.max(currOnes , maxOnes);
        }
        return totalOnes - maxOnes;
    }
}