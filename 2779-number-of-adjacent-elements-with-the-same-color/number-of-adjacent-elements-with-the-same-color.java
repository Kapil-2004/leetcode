class Solution {
    public int[] colorTheArray(int n, int[][] queries) {
        int[] color = new int[n];
        int[] ans = new int[queries.length];
        int count = 0;

        for (int i = 0; i < queries.length; i++) {
            int index = queries[i][0];
            int newColor = queries[i][1];

            if (index > 0 && color[index] == color[index - 1] && color[index] != 0) count--;
            if (index < n - 1 && color[index] == color[index + 1] && color[index] != 0) count--;

            color[index] = newColor;
            if (index > 0 && color[index] == color[index - 1]) count++;
            if (index < n - 1 && color[index] == color[index + 1]) count++;
            ans[i] = count;
        }

        return ans;
    }
}
