package pdpuz;

import java.util.ArrayList;
import java.util.List;

public class Solution_145 {
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
        Solution_145 solution145 = new Solution_145();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(solution145.postorderTraversal(root));

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        postOrderReversal(root, result);

        return result;

    }

    private void postOrderReversal(TreeNode node, List<Integer> result) {
        if (node == null) return;

        postOrderReversal(node.left, result);
        postOrderReversal(node.right, result);
        result.add(node.val);
    }
}
