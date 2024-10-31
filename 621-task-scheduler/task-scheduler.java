class Solution {
    public int leastInterval(char[] tasks, int n) {
        int []freq = new int [26];
        for(char c : tasks){
            freq[c-'A']++;
        }
        int max = freq[0];
        for(int i=1; i<26; i++) {
            max = Math.max(max, freq[i]);
        }
        int res = ((max-1)*(n+1));
        for(int i=0; i<26; i++) {
            if(max == freq[i]) {
                res++;
            }
        }
        return Math.max(res , tasks.length);

    }
}