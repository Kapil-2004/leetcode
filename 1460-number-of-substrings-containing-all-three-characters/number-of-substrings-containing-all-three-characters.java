class Solution {
    public int numberOfSubstrings(String s) {
        int[] freq = new int[3]; // for 'a', 'b', 'c'
        int i = 0;
        int ans = 0;
        for (int j = 0; j < s.length(); j++) {
            freq[s.charAt(j) - 'a']++;
            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                ans += s.length() - j;
                freq[s.charAt(i) - 'a']--;
                i++;
            }
        }
        return ans;
    }
}
