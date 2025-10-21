package pdpuz;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution_27 {
    public static void main(String[] args) {
        Solution_27 sol1 = new Solution_27();
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(sol1.removeElement(nums, val));
    }

    public int removeElement(int[] nums, int val) {
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }
}
