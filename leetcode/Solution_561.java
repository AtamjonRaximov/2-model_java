package pdpuz;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution_561 {
    public static void main(String[] args) {
        Solution_561 solution561 = new Solution_561();

        int[] nums = {1, 4, 3, 2};
        System.out.println(solution561.arrayPairSum(nums));

    }

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int count = 0;

        for (int i = 0; i < nums.length; i = i + 2) {
            count += nums[i];
        }

        return count;
    }
}
