/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int ans=Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        path(root);
        return ans;
    }

    public int path(TreeNode root){
        if(root == null) return 0;

        int left = path(root.left);
        int right = path(root.right);

        int ans1 = left + right + root.val;
        int ans2 = Math.max(left , right) + root.val;
        int ans3 = root.val;

        ans = Math.max(ans , Math.max(ans1 , Math.max(ans2 , ans3)));
        return Math.max(ans2 , ans3);

    }
}