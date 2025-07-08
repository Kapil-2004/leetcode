class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int[] ans = new int[1];
        int[] count = new int[1];
        count[0]=k;
        inorder(root, count, ans);
        return ans[0];
    }

    public void inorder(TreeNode root, int[] k, int[] ans) {
        if (root == null) {
            return;
        }

        inorder(root.left, k, ans);
        k[0]--;
        if (k[0] == 0) {
            ans[0] = root.val;
            return;
        }

        inorder(root.right, k, ans);
    }
}
