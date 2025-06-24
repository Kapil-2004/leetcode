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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode node = new TreeNode (val);
            node.left = root;
            return node;
        }
        path(root , val , depth-1);
        return root ;
    }

    public void path(TreeNode root , int val , int depth){
        if( root == null || depth == 0){
            return ;
        }

        if(depth == 1){
            TreeNode node1 = new TreeNode (val);
            TreeNode node2 = new TreeNode (val);
            node1.left = root.left;
            node2.right = root.right;
            root.left = node1;
            root.right = node2; 
            return;
        }
        path(root.left , val , depth-1);
        path(root.right , val , depth-1);
    }

}