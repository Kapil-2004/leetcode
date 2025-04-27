class Solution {
    public int brokenCalc(int st, int end) {
        int ans = 0;
        while (st < end) {
            if (end % 2 == 0) {
                end /= 2;
            } else {
                end += 1;
            }
            ans++;
        }
        return ans + (st - end);
    }
}
