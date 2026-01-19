package pdpuz;

public class Solution_563 {
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
        Solution_563 solution563 = new Solution_563();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(solution563.findTilt(root));

    }


    int diff=0;
    public int findTilt(TreeNode root) {
        helper(root);
        return diff;
    }
    int helper(TreeNode root){
        if (root == null) return 0;
        if (root.left == null && root.right ==null) return root.val;

        int left = helper(root.left);
        int right= helper(root.right);

        diff+=Math.abs(left-right);

        return left+right+root.val;
    }
}
