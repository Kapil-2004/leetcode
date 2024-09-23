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
    public int ans=0;
    public int longestZigZag(TreeNode root) {
        path(root, 0 , true);
        return ans;
    }

    public void path(TreeNode root , int len , boolean left){
        if(root == null){
            return;
        }

        ans = Math.max(ans , len);

        if(left){
            path(root.right , len+1 , false);
            path(root.left , 1 , true);
        }
        else{
            path(root.right , 1 , false);
            path(root.left , len+1 ,true);
        }
    }
}