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
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int ans=path(root , 1);
        return ans;
    }

    public static int path(TreeNode root ,  int step){
        if(root == null) return step-1;
        int left = path(root.left  , step+1);
        int right = path(root.right  , step+1);
        return Math.max(left , right);
    }
}