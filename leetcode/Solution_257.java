package pdpuz;

import java.util.ArrayList;
import java.util.List;

public class Solution_257 {
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
        Solution_257 solution257 = new Solution_257();

        TreeNode root = new TreeNode(1);
        System.out.println(solution257.binaryTreePaths(root));

    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();

        if (root == null) return list;

        binaryTreePaths(list, root, "");
        return list;

    }

    public void binaryTreePaths(List<String> list, TreeNode node, String path) {
        if (node.left == null && node.right == null) {
            list.add(path+node.val );
            return;
        }

        if (node.left != null) binaryTreePaths(list, node.left, path + node.val + "->");

        if (node.right != null) binaryTreePaths(list, node.right, path + node.val + "->");

    }
}
