package pdpuz;

import java.util.HashMap;

public class Solution_697 {
    public static void main(String[] args) {
        Solution_697 solution697 = new Solution_697();

        int[] nums = {1, 2, 2, 3, 1};
        System.out.println(solution697.findShortestSubArray(nums));

    }

    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>(),
                firstOccurance = new HashMap<>();
        int maxDigree = 0,
                res = 0;
        for (int i = 0; i < nums.length; i++) {
            firstOccurance.putIfAbsent(nums[i], i);
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
            if (freq.get(nums[i]) > maxDigree) {
                maxDigree = freq.get(nums[i]);
                res = i - firstOccurance.get(nums[i]);
            } else if (freq.get(nums[i]) == maxDigree) res = Math.min(res, i - firstOccurance.get(nums[i]));

        }
        return res + 1;

    }
}
