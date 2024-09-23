class Solution {
    public long validSubstringCount(String word1, String word2) {
        long count = 0;
        int[] freqWord2 = new int[26];
        
       
        for (char c : word2.toCharArray()) {
            freqWord2[c - 'a']++;
        }
        
        int[] freqSubstring = new int[26];
        int left = 0;

    
        for (int right = 0; right < word1.length(); right++) {
            
            freqSubstring[word1.charAt(right) - 'a']++;


            while (canBeRearranged(freqSubstring, freqWord2)) {
         
                count += (word1.length() - right);
              
                freqSubstring[word1.charAt(left) - 'a']--;
                left++;
            }
        }
        
        return count;
    }
    
    private boolean canBeRearranged(int[] freqSubstring, int[] freqWord2) {
        for (int i = 0; i < 26; i++) {
            if (freqSubstring[i] < freqWord2[i]) {
                return false;
            }
        }
        return true;
    }
}