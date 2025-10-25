package pdpuz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution_283 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        Solution_283 sol1 = new Solution_283();
        sol1.moveZeroes(nums);

    }

    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }

        }
        while (count < nums.length) {
            nums[count++] = 0;
        }
    }
}
