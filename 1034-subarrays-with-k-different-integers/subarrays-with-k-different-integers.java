class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0, prefix = 0;
        for (int j = 0; j < nums.length; j++) {
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            if (map.size() > k) {
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }
                i++;
                prefix = 0;
            }

            while (map.get(nums[i]) > 1) {
                map.put(nums[i], map.get(nums[i]) - 1);
                i++;
                prefix++;
            }

            if (map.size() == k) {
                ans += prefix + 1;
            }
        }
        return ans;
    }
}
