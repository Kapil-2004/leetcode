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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return path(preorder , inorder , 0 , preorder.length-1 , 0 , inorder.length-1);
    }

    public TreeNode path(int []pre  , int []in , int plo , int phi , int ilo , int ihi){
        if(plo > phi || ilo > ihi) return null;

        TreeNode node = new TreeNode (pre[plo]);
        int idx = search(in , ilo , ihi , pre[plo]);
        int c = idx - ilo;

        node.left = path(pre , in , plo+1 , plo+c , ilo , ihi-1);
        node.right= path(pre , in , plo+c+1 , phi , idx+1 , ihi);

        return node;
    }

    public int search (int [] in , int lo , int hi , int item){
        for(int i=lo ; i<=hi ; i++){
            if(in[i] == item){
                return i;
            }
        }
        return -1;
    }
}