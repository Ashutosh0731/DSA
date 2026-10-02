class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        return ans;
    }

    public void preorder(TreeNode root, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }

        ans.add(root.val);       // Root
        preorder(root.left, ans);   // Left
        preorder(root.right, ans);  // Right
    }
}