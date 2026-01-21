package pdpuz;

public class Solution_572 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        Solution_572 solution572 = new Solution_572();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(5);
        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        System.out.println(solution572.isSubtree(root, subRoot));
    }

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) return false;

        return helper(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

    }

    private boolean helper(TreeNode node, TreeNode subroot) {
        if (node == null && subroot == null) return true;
        if (node == null || subroot == null) return false;
        if (node.val != subroot.val) return false;
        return helper(node.left, subroot.left) && helper(node.right, subroot.right);

    }
}
