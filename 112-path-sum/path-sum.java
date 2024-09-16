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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return path(root , targetSum , 0);
    }

    public boolean path(TreeNode root, int target , int sum ){
        if(root==null){
            return false;
        }
        sum += root.val;
        if(root.right==null && root.left == null && sum==target){
            return true;
        }
        if(root.right == null && root.left == null && sum!=target){
            return false;
        }
        boolean left = path(root.left , target , sum);
        boolean right = path(root.right , target , sum);
        return left||right;
    }
}