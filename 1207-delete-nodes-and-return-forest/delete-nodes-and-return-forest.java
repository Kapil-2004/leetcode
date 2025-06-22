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
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List <TreeNode> ans = new ArrayList <>();
        if(!check(root.val , to_delete)){
            ans.add(root);
        }

        path(root , ans , to_delete);
        return ans;
    }

    public TreeNode path(TreeNode root , List <TreeNode>ans , int[] to_delete ){
        if(root == null) return null;
        root.left = path(root.left , ans , to_delete);
        root.right = path(root.right , ans , to_delete);
        if(check(root.val , to_delete)) {
            if(root.left!=null) ans.add(root.left);
            if(root.right!=null) ans.add(root.right);
            return null;
        }
        
        return root;
    }

    public boolean check(int val , int []delete){
        for(int i : delete){
            if(i == val) return true;
        }
        return false;
    }
}