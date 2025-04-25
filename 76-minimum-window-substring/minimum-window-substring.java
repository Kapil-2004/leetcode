class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (n > m) return "";
        int []map = new int [128];
        int count=0;
        for(int i=0 ; i<n ; i++){
            map[t.charAt(i)]++;
            count++;
        }

        int i=0;
        int st=0;
        int minLen=Integer.MAX_VALUE;

        for(int j=0 ; j<m ; j++){
            if(map[s.charAt(j)]>0) count--;
            map[s.charAt(j)]--;

            while(count==0){
                int currLen = j-i+1;

                if(minLen > currLen){
                    minLen = currLen;
                    st = i;
                }
                map[s.charAt(i)]++;
                if(map[s.charAt(i)] > 0) count++;
                i++;
            }
        }
        return minLen==Integer.MAX_VALUE ? "" : s.substring(st , st + minLen);
    }
}
