package pdpuz;

import java.util.HashMap;
import java.util.Map;

public class Solution_219 {
    public static void main(String[] args) {
        Solution_219 sol1 = new Solution_219();
        int[] arr = {1, 2, 3, 1};
        int k = 3;
        System.out.println(sol1.containsNearbyDuplicate(arr, k));

    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!hm.containsKey(nums[i])) {
                hm.put(nums[i], i);
            } else {
                int PastIndex = hm.get(nums[i]);
                if (Math.abs(PastIndex - i) <= k) {
                    return true;

                } else {
                    hm.put(nums[i],i);
                }
            }
        }
        return false;
    }
}
