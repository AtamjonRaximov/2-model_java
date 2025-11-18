package pdpuz;

import java.util.Stack;

public class Solution_112 {
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
        Solution_112 solution112 = new Solution_112();

        TreeNode treeNode = new TreeNode(1);

        treeNode.left = new TreeNode(5);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.left.left = new TreeNode(8);
        treeNode.left.left.left.left = new TreeNode(11);
        treeNode.left.left.left.left.left = new TreeNode(13);
        treeNode.left.left.left.left.left.left = new TreeNode(4);
        treeNode.left.left.left.left.left.left.left = new TreeNode(7);
        treeNode.right = new TreeNode(2);
        treeNode.left.right = new TreeNode(1);


        int targetSum = 22;

        System.out.println(solution112.hasPathSum(treeNode, targetSum));

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        Stack<TreeNode> node_Stack = new Stack<>();
        Stack<Integer> sum_Stack = new Stack<>();

        node_Stack.add(root);
        sum_Stack.add(targetSum-root.val);

        while (!node_Stack.isEmpty()) {
            TreeNode current_trenode = node_Stack.pop();
            int current_sum = sum_Stack.pop();

            if (current_trenode.left == null && current_trenode.right == null && current_sum == 0) {
                return true;
            }
            if (current_trenode.left != null) {
                node_Stack.add(current_trenode.left);
                sum_Stack.add(current_sum - current_trenode.left.val);
            }
            if (current_trenode.right != null) {
                node_Stack.add(current_trenode.right);
                sum_Stack.add(current_sum - current_trenode.right.val);
            }
        }

        return false;

    }
}
