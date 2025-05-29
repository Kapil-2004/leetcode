class Solution {
    private int ans = 0; 

    public int diameterOfBinaryTree(TreeNode root) {
        path(root); 
        return ans;
    }

    public int path(TreeNode root) {
        if (root == null) return 0;

        int left = path(root.left);
        int right = path(root.right);

        ans = Math.max(ans, left + right); 
        return Math.max(left, right) + 1; 
    }
}
