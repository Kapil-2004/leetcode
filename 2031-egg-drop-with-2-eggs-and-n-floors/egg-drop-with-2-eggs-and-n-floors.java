class Solution {
    public int twoEggDrop(int n) {
        int a=1;
        int b=1;
        int d = b*b+8*n;
        int ans = (int)Math.ceil( (-b + Math.sqrt(d)) / (2.0 * a) );
        return ans;
    }
}