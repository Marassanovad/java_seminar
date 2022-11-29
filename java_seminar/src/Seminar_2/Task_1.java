package Seminar_2;

public class Task_1 {
}

class Solution {
    public List‹Integer› preorderTraversal (TreeNode root) {
        List<Integer> ans = new ArrayList<> () ;
        dfs (root, ans);
        return ans;

                / depth first search
// поиск вглубину
        private void dfs (TreeNode root, List<Integer> ans) {
            if (root == null) return;
            ans. add(root.val);
            dfs (root. left, ans); dfs (root.right, ans);