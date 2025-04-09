class Solution {
    public int[] asteroidCollision(int[] nums) {
        Stack <Integer> st = new Stack <>();
        for(int i=0 ; i<nums.length ; i++){
            boolean flag  = true;
            while(!st.isEmpty() && nums[i] <0 && st.peek() > 0 ){
                if(Math.abs(st.peek()) > Math.abs(nums[i])) {
                    flag = false;
                    break;
                }
                else if(Math.abs(st.peek()) < Math.abs(nums[i])) st.pop();
                else{
                    st.pop();
                    flag = false;
                    break;
                }
            }
            if(flag) st.push(nums[i]);
        }
        int k=st.size();
        int []ans = new int [k];
        for(int i=k-1 ; i>=0 ; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}