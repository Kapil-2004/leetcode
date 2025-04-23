class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap <Integer , Integer> map = new HashMap <>();
        map.put(0 , 1);
        int odd=0;
        int ans=0;
        for(int i : nums){
            if(i%2 ==1) odd++;
            if(map.containsKey(odd-k)){
                ans += map.get(odd-k);
            }
            map.put(odd , map.getOrDefault(odd , 0)+1);
        }
        return ans;
    }
}