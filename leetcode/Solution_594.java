package pdpuz;

import java.util.HashMap;

public class Solution_594 {
    public static void main(String[] args) {
        Solution_594 solution594 = new Solution_594();

        int[] arr = {1, 3, 2, 2, 5, 2, 3, 7};
        System.out.println(solution594.findLHS(arr));

    }

    public int findLHS(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (map.containsKey(num + 1)) result = Math.max(map.get(num) + map.get(num + 1), result);
        }
        return result;

    }
}
