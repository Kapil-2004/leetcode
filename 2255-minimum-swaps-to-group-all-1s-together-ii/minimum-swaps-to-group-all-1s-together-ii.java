class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int totalOnes = 0;
        int maxOnes=0 ;
        int currOnes=0 ;
        for(int i :nums){
            if(i==1) totalOnes++;
        }

        int i=0 ;
        for(int j=0 ; j<2*n ; j++){
            if(nums[j%n] ==1 ) currOnes++;
            if(j-i+1 > totalOnes){
                if(nums[i%n] == 1) currOnes--;
                i++;
            }
            maxOnes = Math.max(currOnes , maxOnes);
        }
        return totalOnes - maxOnes;
    }
}