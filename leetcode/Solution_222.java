package pdpuz;

public class Solution_222 {
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
        Solution_222 solution222 = new Solution_222();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.right = new TreeNode(5);
        System.out.println(solution222.countNodes(root));

    }

    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        int lh = leftHegiht(root);
        int rh = rightHegiht(root);

        if (lh == rh) {
            return (int) (Math.pow(2, lh) - 1);
        }
        return countNodes(root.left) + countNodes(root.right) +1;

    }

    private int leftHegiht(TreeNode root) {
        if (root == null)
            return 0;
        return leftHegiht(root.left) + 1;
    }

    private int rightHegiht(TreeNode root) {
        if (root == null)
            return 0;
        return rightHegiht(root.right) + 1;
    }


}
