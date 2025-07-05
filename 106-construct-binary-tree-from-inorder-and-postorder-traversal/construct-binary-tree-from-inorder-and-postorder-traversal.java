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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return create(inorder , postorder , postorder.length-1 , 0 , inorder.length-1);
    }

    public TreeNode create(int[] in, int[] pos , int plo , int ilo , int ihi ){
        if(ilo > ihi || plo<0) return null;

        int idx = search(in , pos[plo] , ilo , ihi);
        int c = ihi-idx;
        TreeNode root = new TreeNode(pos[plo]);
        root.right = create(in , pos , plo-1 , idx+1 , ihi);
        root.left = create(in , pos , plo-c-1 , ilo , idx-1);
        return root;
    }

    public int search(int []in , int val , int ilo , int ihi){
        for(int i=ilo ; i<=ihi ; i++){
            if(in[i] == val){
                return i;
            }
        }
        return -1;
    }
}