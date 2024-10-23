class Solution {
    public List<String> stringSequence(String s) {
        int n = s.length();
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<n ; i++){
            char ch = s.charAt(i);
            while(sb.length() != i+1 || sb.charAt(i) != ch){
                if(sb.length()!=i+1){
                    sb.append('a');
                    list.add(sb.toString());
                }
                else{
                    if(sb.charAt(i)=='z'){
                        sb.setCharAt(i , 'a');
                        list.add(sb.toString());
                    }
                    else{
                        int a = sb.charAt(i) + 1;;
                        sb.setCharAt(i , (char)a);
                        list.add(sb.toString());
                    }
                }
            }
        }
        return list;
    }
}