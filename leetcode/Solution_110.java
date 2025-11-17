package pdpuz;

import pdpuz.Comparator.Main;

public class Solution_110 {
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
        Solution_110 solution110 = new Solution_110();

        TreeNode treeNode = new TreeNode(1);

        System.out.println(solution110.isBalanced(treeNode));

    }

    boolean balance = true;

    public boolean isBalanced(TreeNode root) {
        if (root == null) return balance;

        help(root);

        return balance;

    }

    private int help(TreeNode node) {
        if (node == null) return 0;

        int right = help(node.right),
                left = help(node.left);

        if (Math.abs(left - right) > 1) {
            balance = false;
        }
        return 1 + Math.max(right, left);
    }
}
