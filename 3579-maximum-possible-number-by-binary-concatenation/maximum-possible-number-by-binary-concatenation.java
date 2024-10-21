class Solution {
    public int maxGoodNumber(int[] nums) {
        // Ensure nums has at least 3 elements
        if (nums.length < 3) {
            throw new IllegalArgumentException("Input array must have at least three elements.");
        }

        // Get binary representations
        String x = Integer.toBinaryString(nums[0]);
        String y = Integer.toBinaryString(nums[1]);
        String z = Integer.toBinaryString(nums[2]);

        // Use StringBuilder to construct concatenated binary strings
        int max = Integer.MIN_VALUE;

        // Concatenate and convert to integer
        max = Math.max(max, Integer.parseInt(x + y + z, 2));
        max = Math.max(max, Integer.parseInt(x + z + y, 2));
        max = Math.max(max, Integer.parseInt(y + x + z, 2));
        max = Math.max(max, Integer.parseInt(y + z + x, 2));
        max = Math.max(max, Integer.parseInt(z + x + y, 2));
        max = Math.max(max, Integer.parseInt(z + y + x, 2));

        return max;
    }
}