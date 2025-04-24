class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int []nums = new int [k*2+1];
        int j=0;
        for(int i=cardPoints.length-k ; i<cardPoints.length ; i++){
            nums[j++] = cardPoints[i];
        }
        for(int i=0 ; i<k ; i++){
            nums[j++] = cardPoints[i];
        }

        int n=0;
        int ans=0;
        int sum=0;
        for(int m=0 ; m<nums.length ; m++){
            sum += nums[m];
            if(m-n+1 == k){
                ans= Math.max(sum , ans);
                sum -= nums[n];
                n++;
            }
        }
        return ans;
    }
}