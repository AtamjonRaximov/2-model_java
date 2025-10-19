package pdpuz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Solution_26 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3};
        Solution_26 sol1 = new Solution_26();
        System.out.println(sol1.removeDuplicates(arr));

    }

    public int removeDuplicates(int[] nums) {
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            } else {
                nums[counter] = nums[i];
                counter++;
            }

        }
        return counter;

    }
}

