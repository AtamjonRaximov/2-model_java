package pdpuz;

public class Solution_671 {
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
        Solution_671 solution671 = new Solution_671();

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(5);

        System.out.println(solution671.findSecondMinimumValue(root));

    }


    Integer min1 = null,
            min2 = null;

    public int findSecondMinimumValue(TreeNode root) {
        min1 = root.val;
        dfs(root);
        return min2 != null ? min2 : -1;
    }

    public void dfs(TreeNode node) {
        if (node == null) return;
        if (min1 < node.val && (min2 == null || min2 > node.val)) min2 = node.val;
        else if (min1 == node.val) {
            dfs(node.left);
            dfs(node.right);
        }
    }
}
