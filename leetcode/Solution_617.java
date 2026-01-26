package pdpuz;

public class Solution_617 {
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

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

    public static void main(String[] args) {
        Solution_617 solution617 = new Solution_617();

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.left.left = new TreeNode(5);
        root1.right = new TreeNode(2);
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.left.left = new TreeNode(4);
        root2.right = new TreeNode(3);
        root2.right.right = new TreeNode(7);

        System.out.println(solution617.mergeTrees(root1, root2));

    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        TreeNode mergeTree = new TreeNode(root1.val + root2.val);
        mergeTree.left = mergeTrees(root1.left, root2.left);
        mergeTree.right = mergeTrees(root1.right, root2.right);
        return mergeTree;

    }
}
