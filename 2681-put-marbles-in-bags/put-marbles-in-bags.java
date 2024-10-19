import java.util.*;

class Solution {
    public long putMarbles(int[] arr, int k) {
        // Create an array to store the sums of adjacent pairs.
        int[] num = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            num[i] = arr[i] + arr[i + 1];
        }
        
        Arrays.sort(num);
        long min = 0;
        for (int i = 0; i < k - 1; i++) {
            min += num[i];
        }
        long max = 0;
        for (int i = num.length - 1; i >= num.length - (k - 1); i--) {
            max += num[i];
        }
        return max - min;
    }
}
