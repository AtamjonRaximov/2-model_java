package pdpuz;

public class Solution_1 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        Solution_1 sol1 = new Solution_1();
        int[] result = sol1.twoSum(arr, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}
