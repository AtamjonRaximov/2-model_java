package pdpuz;

public class Solution_111 {
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
        Solution_111 sol1 = new Solution_111();

        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(3);
        treeNode.left.left = new TreeNode(9);
        treeNode.left.left.left = new TreeNode(20);
        treeNode.left.right = new TreeNode(7);
        treeNode.right = new TreeNode(15);
        System.out.println(sol1.minDepth(treeNode));
    }

    public int minDepth(TreeNode root) {
        return root == null ? 0 : getMinMath(root);

    }

    private int getMinMath(TreeNode root) {
        if (root == null) return Integer.MAX_VALUE;
        if (root.left == null && root.right == null) return 1;
        return Math.min(getMinMath(root.left), getMinMath(root.right)) + 1;
    }
}
