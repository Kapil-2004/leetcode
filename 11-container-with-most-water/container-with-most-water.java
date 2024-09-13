class Solution {
    public int maxArea(int[] height) {
        int n=height.length ;
        int st=0 ; 
        int end=n-1; 
        int ans=0;
        while(st<end){
            if(ans < ((end-st)*Math.min(height[st],height[end]))){
                ans=(end-st)*Math.min(height[st],height[end]);
            }
            if(height[st]>height[end]) end-- ;
            else st++;
        }
        return ans;
    }
}