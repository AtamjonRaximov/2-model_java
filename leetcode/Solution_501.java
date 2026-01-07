package pdpuz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution_501 {
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
        Solution_501 solution501 = new Solution_501();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(2);
        System.out.println(Arrays.toString(solution501.findMode(root)));

    }

    public int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();

        helper(root, map);

        int maxFreq = 0;

        for (int key : map.keySet()) {
            int currenKey = map.get(key);
            maxFreq = Math.max(maxFreq, currenKey);
        }

        List<Integer> list = new ArrayList<>();

        for (int key : map.keySet()) if (map.get(key) == maxFreq) list.add(key);

        int[] res = new int[list.size()];

        int index = 0;

        for (int curr : list) res[index++] = curr;

        return res;
    }

    void helper(TreeNode root, HashMap<Integer, Integer> map) {
        if (root == null) return;

        int val = root.val;

        map.put(val, map.getOrDefault(val, 0) + 1);

        helper(root.left, map);
        helper(root.right, map);
    }
}
