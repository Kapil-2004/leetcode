import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> ll = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode a = q.poll();
                ll.add(a.val);
                if (a.left != null) {
                    q.add(a.left);
                }
                if (a.right != null) {
                    q.add(a.right);
                }
            }
            ans.add(ll);
        }

        return ans;
    }
}