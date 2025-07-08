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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        path(root , pq);
        while(k>1){
            pq.poll();
            k--;
        }
        return pq.poll();
    }

    public static void path(TreeNode root, PriorityQueue<Integer> pq){
        if(root == null) return;
        pq.add(root.val);
        path(root.left , pq);
        path(root.right , pq);
    }
}