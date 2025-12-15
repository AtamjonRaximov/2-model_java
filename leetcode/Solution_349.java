package pdpuz;

import java.util.Arrays;
import java.util.HashSet;

public class Solution_349 {
    public static void main(String[] args) {
        Solution_349 solution = new Solution_349();

        int[] num1 = {1, 2, 2, 1};
        int[] num2 = {2, 2};
        System.out.println(Arrays.toString(solution.intersection(num1, num2)));

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (Integer i : nums1) {
            set1.add(i);
        }
        for (Integer i : nums2) {
            if (set1.contains(i)){
                set2.add(i);
            }
        }
        int[] res = new int[set2.size()];
        int index = 0;

        for (Integer i : set2) {
            res[index++] = i;
        }
        int a = b
        return res;
    }
}
