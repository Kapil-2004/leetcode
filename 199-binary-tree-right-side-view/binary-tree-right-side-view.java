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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList <>();
        path(root , ans , 0);
        return ans;
    }

    public void path(TreeNode root , List<Integer> ans , int level ){
        if(root == null){
            return ;
        }
        if(level >= ans.size()){
            ans.add(root.val);
        }
        if(root.left == null && root.right == null){
            return;
        }
        path(root.right , ans , level+1);
        path(root.left , ans  , level+1);
    }

}