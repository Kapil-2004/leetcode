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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList <>();
        List <Integer> list = new ArrayList <>();
        path(root , targetSum , 0 , list , ans);
        return ans;
    }

    public void path(TreeNode root , int target , int sum , List<Integer> list , List<List<Integer>> ans){
        if(root == null){
            return ;
        }

        list.add(root.val);
        sum += root.val;

        if(sum == target && root.left == null && root.right == null){
            ans.add(new ArrayList<>(list));
        }
        
        path(root.left , target , sum , list , ans );
        path(root.right , target , sum , list , ans );
        list.remove(list.size()-1);
    }
}