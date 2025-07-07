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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> qindex = new LinkedList<>();

        q.add(root);
        qindex.add(1);
        int max=1;

        while(!q.isEmpty()){
            int st=0 , end=0;
            int size = q.size();

            for(int i=0 ; i<size ; i++){
                TreeNode node = q.poll() ;
                int parent = qindex.poll() ;

                if (i == 0) st = parent;
                if (i == size - 1) end = parent;

                if(node.left != null) {
                    qindex.add(parent*2);
                    q.add(node.left);
                }

                if(node.right != null) {
                    qindex.add(parent*2 +1);
                    q.add(node.right);
                }
                
            }
            max = Math.max(max , end-st+1);
        }

        return max;
    }
}