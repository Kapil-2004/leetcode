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
    public boolean isValidBST(TreeNode root) {
        return path(root , Long.MIN_VALUE , Long.MAX_VALUE);
    }

    public boolean path(TreeNode root , long min , long max){
        if(root == null) return true;
        if(root.val >= max || root.val <= min) return false;
        return path(root.left , min , root.val) && path(root.right , root.val , max);
    }
}