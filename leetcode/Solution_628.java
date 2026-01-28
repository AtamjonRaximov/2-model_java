package pdpuz;

import java.util.Arrays;

public class Solution_628 {
    public static void main(String[] args) {
        Solution_628 solution628 = new Solution_628();

        int[] nums = {1, 2, 3};
        System.out.println(solution628.maximumProduct(nums));

    }

    public int maximumProduct(int[] nums) {
        int n = nums.length;

        Arrays.sort(nums);

        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[n - 1] * nums[0] * nums[1]);
    }
}
