class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        int n = values.length;
        boolean []check = new boolean [n];
        Arrays.fill(check , false);
        long ans=0;
        int i=0;

        while(i>=0 && i<n ){
            if(check[i]){
                return ans;
            }
            String s = instructions[i];

            if(s.equals("jump")){
                check[i] = true;
                i += values[i];
            }
            else{
                ans += values[i];
                check[i] = true;
                i++;
            }
        }
        return ans; 
    }
}