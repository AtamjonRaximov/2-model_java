package pdpuz;

public class Solution_543 {
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
        Solution_543 solution543 = new Solution_543();


        TreeNode root = new TreeNode();
        root.left = new TreeNode(1);

        System.out.println(solution543.diameterOfBinaryTree(root));
    }

    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxDiameter;
    }

    private int dfs(TreeNode node) {
        if (node == null) return 0;

        int left = dfs(node.left);
        int right = dfs(node.right);

        // diameter update
        maxDiameter = Math.max(maxDiameter, left + right);

        // return height
        return Math.max(left, right) + 1;
    }


}
