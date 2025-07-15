class Solution {
    public int compress(char[] chars) {
        int ans=0;
        int i=0;
        for(int j=0 ; j<chars.length ;){
            int count=0;
            char c = chars[i];
            while(j<chars.length && chars[j] == chars[i]){
                count++;
                j++;
            }
            chars[ans++] = c;

            if (count > 1) {
                for (char ch : String.valueOf(count).toCharArray()) {
                    chars[ans++] = ch;
                }
            }

            i=j;
        }
        return ans;
    }
}