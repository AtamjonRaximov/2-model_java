package pdpuz;

import java.util.TreeSet;

public class Solution_414 {
    public static void main(String[] args) {
        Solution_414 solution414 = new Solution_414();

        int[] nums = {-2147483648, 1, 1};
        System.out.println(solution414.thirdMax(nums));

    }

    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            set.add(num);
            if (set.size() > 3) {
                set.pollFirst();
            }
        }
        if (set.size() < 3) {
            while (set.size() > 1) {
                set.pollFirst();
            }
        }

        return set.pollFirst();
    }
}
