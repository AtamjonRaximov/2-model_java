package pdpuz;

public class Solution_108 {
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
        Solution_108 sol1 = new Solution_108();

        int[] arr = {-10, -3, 0, 5, 9};


        System.out.println(sol1.sortedArrayToBST(arr));

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return createTree(nums, 0, nums.length - 1);

    }

    private TreeNode createTree(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = createTree(nums, start, mid - 1);
        node.right = createTree(nums, mid + 1, end);
        return node;
    }
}
