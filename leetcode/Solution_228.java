package pdpuz;

import java.util.LinkedList;
import java.util.List;

public class Solution_228 {
    public static void main(String[] args) {
        Solution_228 solution228 = new Solution_228();

        int[] nums = {0, 1, 2, 4, 5, 7};
        System.out.println(solution228.summaryRanges(nums));

    }

    public List<String> summaryRanges(int[] nums) {
        LinkedList<String> res = new LinkedList<>();
        if (nums.length == 0) return res;

        int start = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    res.add(String.valueOf(start));
                } else {
                    res.add(start + "->" + nums[i - 1]);
                }
                start = nums[i];
            }
        }

        if (start == nums[nums.length - 1]) {
            res.add(String.valueOf(start));
        } else {
            res.add(start + "->" + nums[nums.length - 1]);
        }

        return res;

    }

}
