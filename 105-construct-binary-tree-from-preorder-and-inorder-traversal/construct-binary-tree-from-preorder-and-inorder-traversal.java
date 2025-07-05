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
        return create(preorder , inorder , 0 , 0 , inorder.length-1 );
    }

    public TreeNode create(int[] pre , int []in , int plo, int ilo , int ihi){
        if(ilo > ihi) return null;
        int idx = search(pre[plo] , ilo , ihi , in);
        int leftsubtree = idx-ilo;
        TreeNode root = new TreeNode(pre[plo]);

        root.left = create(pre , in , plo+1 , ilo , idx-1);
        root.right= create(pre , in , plo+leftsubtree+1 , idx+1 , ihi);

        return root;
    }

    public int search(int val , int ilo , int ihi , int []in){
        for(int i=ilo ; i<=ihi ; i++){
            if(in[i] == val){
                return i;
            }
        }
        return -1;
    }
}