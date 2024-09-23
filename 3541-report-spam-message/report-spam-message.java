class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        int n=message.length;
        int m=bannedWords.length;
        HashSet<String> set = new HashSet<>();
        for (String word : bannedWords) {
            set.add(word);
        }
        
        int count=0;
        for(String msg : message){
            if(set.contains(msg)){
                count++;
            }
        }
        return count>=2;
    }
}