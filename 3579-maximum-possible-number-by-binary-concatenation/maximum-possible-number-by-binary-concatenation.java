class Solution {
    public int maxGoodNumber(int[] nums) {
        String [] arr = new String [6];
        arr[0] = Integer.toBinaryString(nums[0])+Integer.toBinaryString(nums[1])+Integer.toBinaryString(nums[2]);
        arr[1] = Integer.toBinaryString(nums[0])+Integer.toBinaryString(nums[2])+Integer.toBinaryString(nums[1]);
        arr[2] = Integer.toBinaryString(nums[1])+Integer.toBinaryString(nums[0])+Integer.toBinaryString(nums[2]);
        arr[3] = Integer.toBinaryString(nums[1])+Integer.toBinaryString(nums[2])+Integer.toBinaryString(nums[0]);
        arr[4] = Integer.toBinaryString(nums[2])+Integer.toBinaryString(nums[1])+Integer.toBinaryString(nums[0]);
        arr[5] = Integer.toBinaryString(nums[2])+Integer.toBinaryString(nums[0])+Integer.toBinaryString(nums[1]);
        Arrays.sort(arr);
        return Integer.parseInt(arr[5], 2);
    }
}