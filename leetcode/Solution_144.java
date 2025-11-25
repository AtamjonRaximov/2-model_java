package pdpuz;

import java.util.ArrayList;
import java.util.List;

public class Solution_144 {
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
        Solution_144 solution144 = new Solution_144();

        TreeNode treeNode = new TreeNode(1);
        treeNode.left=new TreeNode(2);
        treeNode.right=new TreeNode(3);
        System.out.println(solution144.preorderTraversal(treeNode));

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversalCheck(root,result);


        return result;
    }

    private void preorderTraversalCheck(TreeNode root, List<Integer> result) {
        if (root == null) return;
        result.add(root.val);
        preorderTraversalCheck(root.left,result);
        preorderTraversalCheck(root.right,result);
    }
}
