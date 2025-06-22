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
    public boolean isCompleteTree(TreeNode root) {
        int totalnodes = count(root);
        return path(root , totalnodes , 1);
    }

    public boolean path(TreeNode root , int total , int visited){
        if(root == null) return true;
        if(visited > total) return false;

        return path(root.left , total , 2*visited) && path(root.right , total , 2*visited+1);
    }

    public int count(TreeNode root){
        if(root == null) return 0;
        return count(root.left) + count(root.right) + 1; 
    }
}