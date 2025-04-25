class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (n > m) return "";

        HashMap<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map1.put(t.charAt(i), map1.getOrDefault(t.charAt(i), 0) + 1);
        }

        String ans = "";
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0, formed = 0;
        int required = map1.size();

        for (int j = 0; j < m; j++) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if (map1.containsKey(ch) && map.get(ch).intValue() == map1.get(ch).intValue()) {
                formed++;
            }

            while (i <= j && formed == required) {
                String s1 = s.substring(i, j + 1);
                if (ans.equals("") || s1.length() < ans.length()) {
                    ans = s1;
                }

                char leftChar = s.charAt(i);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map1.containsKey(leftChar) && map.get(leftChar) < map1.get(leftChar)) {
                    formed--;
                }

                i++;
            }
        }

        return ans;
    }
}
